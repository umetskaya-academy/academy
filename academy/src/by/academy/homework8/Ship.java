package by.academy.homework8;

import java.util.Random;

public class Ship implements Runnable {
	private Harbor harbor;
	private static Random random = new Random();

	public Ship(Harbor harbor) {
		super();
		this.harbor = harbor;
	}

	public Harbor getHarbor() {
		return harbor;
	}

	public void setHarbor(Harbor harbor) {
		this.harbor = harbor;
	}

	public static Random getRandom() {
		return random;
	}

	public static void setR(Random random) {
		Ship.random = random;
	}

	public Runnable getShipNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
