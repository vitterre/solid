package com.solid.bad;

// Старый домашний телефон
public class LandPhone implements IPhone {

	@Override
	public void call() {
		// ...
	}

	@Override
	public void sendMessage() {
		// Старый телефон не может отправлять сообщения,
		// что тогда тут делать?
	}

	@Override
	public void takePhoto() {
		// Здесь вообще молчу
	}
}
