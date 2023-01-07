package com.solid.bad;

// Этот класс менять нельзя!
public class SMTPMailer {
	private final FileLogger logger; // Хотим заменить на DataBaseLogger, но нельзя!

	public SMTPMailer() {
		this.logger = new FileLogger();
	}

	public void sendMessage(String message) {
		this.logger.log("Send [" + message + "]");
	}
}
