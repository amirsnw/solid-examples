package com.snw.dependencyInversion.solution;

import com.snw.dependencyInversion.problem.JSONFormatter;
import com.snw.dependencyInversion.problem.Message;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");
		MessagePrinter printer = new MessagePrinter();

		// Not we can customize where to write our message

		// console
		try (PrintWriter writer = new PrintWriter(System.out)) {
			printer.writeMessage(msg, new JSONFormatter(), writer);
		}

		// or file
		try (PrintWriter writer = new PrintWriter(new FileWriter("test_msg.txt"))) {
			printer.writeMessage(msg, new JSONFormatter(), writer);
		}
	}

}
