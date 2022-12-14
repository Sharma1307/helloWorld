package com.test;

public class Car {
	
	private String doors;
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
	

	public Car(String doors, String engine, String wheels, int speed) {
	super();
	this.doors = doors;
	this.engine = engine;
	this.wheels = wheels;
	this.speed = speed;
}
	
	public String getDoor() {
		return doors;
	}
	public void setDoor(String doors) {
		this.doors = doors;
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
		
		if(doors.equals("closed") && engine.equals("on")
				&& wheels.equals("good")&& speed>0) {
			return "running";
		}
		else {
			return "Not Running";
		}
	}
	
	
}
