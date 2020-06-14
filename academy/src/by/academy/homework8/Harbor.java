package by.academy.homework8;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Harbor implements Runnable {
	private int store;

	private final int MAX_CONTAINERS_COUNT = 50;

	private int containersCount;
	private static Random r = new Random();

	public Harbor(int[] store) {
		this.containersCount = r.nextInt(MAX_CONTAINERS_COUNT);
		int storeCount;
		store = new int[storeCount];
		for (int i = 0; i < storeCount; i++) {
			int store = true;
		}
		Semaphore semaphore = new Semaphore(storeCount, false);
	}

	public int getContainersCount() {
		return containersCount;
	}

	public void setContainersCount(int containersCount) {
		this.containersCount = containersCount;
	}

	public int getMaxContainersCount() {
		return this.MAX_CONTAINERS_COUNT;
	}

	@Override
	public void run() {
	}
	// TODO Auto-generated method stub

	public void put(int count) {
			try {
				Semaphore semaphore;
				semaphore.acquire();

				int storeNum = -1;
				synchronized (store) {
					for (int i = 0; i < store.length; i++) {
						if (store[i]) {
							store[i] = false;
							storeNum = i;
							System.out.printf(Thread.currentThread().getName(), i);
							break;
						}
					}
				}

				

				synchronized (storeCount) {
					int storeCount;
					int freeSpace = MAX_CONTAINERS_COUNT - storeCount;
					if (freeSpace >= count) {
						storeCount += count;
						Thread.currentThread().getName(), count, storeCount);
					} else {
						storeCount += freeSpace;
						Thread.currentThread().getName(), freeSpace, storeCount);
					}
					synchronized (store) {
						store[storeNum] = true;
					}
				}

				semaphore.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		

	synchronized(storeCount)

	{
					if (storeCount >= value) {
						Thread.currentThread().getName(), value, storeCount);
					} else {
						Thread.currentThread().getName(), storeCount, 0);
						storeCount = 0;
					}
					synchronized (docks) {
						store[storeNum] = true;
					}
				}

	semaphore.release();}catch(

	InterruptedException e)
	{
		e.printStackTrace();
	}

}
