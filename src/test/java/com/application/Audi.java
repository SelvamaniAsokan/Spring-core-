package com.application;

public class Audi implements Car {

	Engine engine;

	public Audi(Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String getdetail() {
		// TODO Auto-generated method stub
		return "Audi – Sleek design meets cutting‑edge technology, redefining modern elegance";
	}

	

}
