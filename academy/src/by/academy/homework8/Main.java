package by.academy.homework8;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	private static final int MAX_CONTAINERS = 50;
	public static AtomicInteger containers;
	public static Random random;

	public synchronized void getContainers() throws InterruptedException {
		containers.getAndDecrement();
	}

	public synchronized void putContainers() throws InterruptedException {
		containers.getAndIncrement();
	}

	public synchronized int getAllContaners() {
		return containers.get();
	}

	public synchronized int getMAX_CONTAINERS() {
		return MAX_CONTAINERS;
	}

	public static void main(String[] args) {
		Harbor harbor = new Harbor(10);
		for (int i = 0; i < 50; i++) {
			Ship ship = new Ship(10);
			new Thread(ship.getShipNumber()).start();
		}
	}
}
