
/*
 Program 1. Create a Thread using Lambda .		
 @Author: Somnath
 @Date: 13th Oct, 2022
 */

package com.lab1;

public class ThreadLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// without lamda
		ThreadLamda d1 = new ThreadLamda();

		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName() + " Lamda Without Thread is Running");
			}
		};
		Thread t1 = new Thread(r, "Somu");
		t1.start();

		// with lamda
		Runnable r2 = () -> {
			System.out.println(Thread.currentThread().getName() + " Lamda With Thread is Running");
		};

		Thread t2 = new Thread(r2, "Somnath");
		t2.start();
	}

}
