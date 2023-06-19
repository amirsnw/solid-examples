package com.snw.dependencyInversion.problem;

import java.io.IOException;

public class _Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");
		_MessagePrinter printer = new _MessagePrinter();

		// TODO: We can only write message to a file (no future modification)
		printer.writeMessage(msg, "test_msg.txt");
	}

}
