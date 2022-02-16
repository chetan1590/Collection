package com.synchronization;

public class Display extends Thread {
	public synchronized  void m1() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("m1");
			wait(2000);
		}
	}

	public synchronized void m2() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("m2");
			wait(2000);
		}
	}

	@Override
	public void run() {
		try {
			m1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			m2();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
