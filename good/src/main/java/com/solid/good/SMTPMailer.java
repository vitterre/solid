package com.solid.good;

public class SMTPMailer {
	private final ILogger logger; // Этим логером может быть абсолютно любой класс,
	                              // реализующий ILogger

	public SMTPMailer(ILogger logger) {
		this.logger = logger;
	}

	public void sendMessage(String message) {
		this.logger.log("Send [" + message + "]");
	}
}
