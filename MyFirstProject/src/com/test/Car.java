package com.test;

public class Car {
	
	private String door;
	private String engine;
	private String wheels;
	private int speed;
	
//	public Car() {
//		door = "closed";
//		engine = "on";
//		wheels = "good";
//		speed = 6;
//		
//	}
//	
	

	public Car(String door, String engine, String wheels, int speed) {
	super();
	this.door = door;
	this.engine = engine;
	this.wheels = wheels;
	this.speed = speed;
}
	
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getWheels() {
		return wheels;
	}
	public void setWheels(String wheels) {
		this.wheels = wheels;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		
		if(door.equals("closed") && engine.equals("on")
				&& wheels.equals("good")&& speed>0) {
			return "running";
		}
		else {
			return "Not Running";
		}
	}
	
	
}
