package com.snw.openClose.problem;

import java.util.List;

public class _ISPSubscriber {

    private long subscriberId;

    private String address;

    private String phoneNumber;

    private int baseRate;

    private long freeUsage;

    public _ISPSubscriber(long subscriberId, String address, String phoneNumber, int baseRate, long freeUsage) {
        this.subscriberId = subscriberId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.baseRate = baseRate;
        this.freeUsage = freeUsage;
    }

    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;

        if (chargeableData <= 0) {
            return 0;
        }
        return chargeableData * baseRate / 100;
    }

    /**
     * @return the subscriberId
     */
    public long getSubscriberId() {
        return subscriberId;
    }

    /**
     * @param subscriberId the subscriberId to set
     */
    public void setSubscriberId(long subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the baseRate
     */
    public int getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate the baseRate to set
     */
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    /**
     * @return the freeUsage
     */
    public long getFreeUsage() {
        return freeUsage;
    }

    /**
     * @param freeUsage the freeUsage to set
     */
    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    
}