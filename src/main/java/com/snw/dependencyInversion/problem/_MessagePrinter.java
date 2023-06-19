package com.snw.dependencyInversion.problem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _MessagePrinter {

	// Writes message to a file
	public void writeMessage(Message msg, String fileName) throws IOException {
		// TODO: Get Formatter from the outer world
		Formatter formatter = new JSONFormatter();

		// TODO: Get PrintWriter from the outer world
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { // creates print writer
			writer.println(formatter.format(msg)); // formats and writes message
			writer.flush();
		}
	}
}
