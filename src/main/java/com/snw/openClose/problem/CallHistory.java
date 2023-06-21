package com.snw.openClose.problem;

import java.time.LocalDateTime;
import java.util.*;

public class CallHistory { // Immutable

    public static class Call {
        
        private LocalDateTime begin;
        
        private long duration;

        private long subscriberId;

        public Call(long subscriberId, LocalDateTime begin, long duration) {
            this.begin = begin;
            this.duration = duration;
            this.subscriberId = subscriberId;
        }

        /**
         * @return the begin
         */
        public LocalDateTime getBegin() {
            return begin;
        }

        /**
         * @return the duration
         */
        public long getDuration() {
            return duration;
        }

        /**
         * @return the subscriber
         */
        public long getSubscriberId() {
            return subscriberId;
        }

    }

    private static final Map<Long, List<Call>> CALLS = new HashMap<>();

    public synchronized static List<Call> getCurrentCalls(long subscriberId) {
        if(!CALLS.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return CALLS.get(subscriberId);
    }

    public synchronized static void addSession(long subscriberId, LocalDateTime begin, long duration) {
        List<Call> calls;
        if(!CALLS.containsKey(subscriberId)) {
            calls = new LinkedList<>();
            CALLS.put(subscriberId, calls);
        } else {
            calls = CALLS.get(subscriberId);
        }
        calls.add(new Call(subscriberId, begin, duration));
    }
}