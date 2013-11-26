package com.maomaogong.threadingtest;

public class Rabbit implements Runnable {
	private String gsName;
	
	public Rabbit() {
		
		this("Generic Rabbit");
		
	} //public Rabbit() {
	
	public Rabbit(String isName) {
		
		this.gsName = isName;
		System.out.println("Rabbit constructed:" + gsName);
		
	} //public Rabbit(String isName) {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int liI = 0; liI < 20; liI++){
			System.out.println(gsName + " is hopping...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //try {
		} //for(int liI = 0; liI < 20; liI++){
		
	} //public void run() {

} //public class Rabbit implements Runnable {