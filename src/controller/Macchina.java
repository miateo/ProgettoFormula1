package controller;

import java.util.concurrent.Semaphore;

public class Macchina extends Thread{

	static Semaphore sem = new Semaphore(1);
	private Classifica classifica;
	private String x;
	
	public Macchina(Classifica classifica, String x) {
		this.classifica = classifica;
		this.x = x;
		this.start();
	}

	public void run()
	{
			try {
					Thread.sleep((int)(Math.random()*100));
					sem.acquire();
					classifica.Queue(x);
					sem.release();
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}