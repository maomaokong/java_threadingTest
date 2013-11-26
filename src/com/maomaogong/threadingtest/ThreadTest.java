package com.maomaogong.threadingtest;

public class ThreadTest {

	public static void main(String[] args) {
		
		Rabbit lR1 = new Rabbit();
		Rabbit lR2 = new Rabbit("Peter");
		Rabbit lR3 = new Rabbit("Runny Rabbit");
		
		Thread lT1 = new Thread(lR1);
		Thread lT2 = new Thread(lR2);
		Thread lT3 = new Thread(lR3);
		
		lT1.start();
		lT2.start();
		lT3.start();
		
	} //public static void main(String[] args) {
	
} //public class ThreadTest {