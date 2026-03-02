package com.application;

public class Thar implements Car {

	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String getdetail() {
		// TODO Auto-generated method stub
		return " Thar – Rugged, adventurous, and iconic, built for off‑road freedom and bold journeys.";
	}

}
