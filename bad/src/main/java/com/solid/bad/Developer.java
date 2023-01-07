package com.solid.bad;

public class Developer {
	private App app;

	public void startWorkingOnApp() {
		this.app = new WebApp();
	}

	public void work() {
		// Здесь что-то вызывается у app
	}
}
