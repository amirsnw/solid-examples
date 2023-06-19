package com.snw.dependencyInversion.solution;

import com.snw.dependencyInversion.problem.Formatter;
import com.snw.dependencyInversion.problem.Message;

import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	// Writes message to a file
	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException {

		writer.println(formatter.format(msg)); // formats and writes message
		writer.flush();
	}
}
