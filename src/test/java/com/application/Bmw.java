package com.application;

public class Bmw implements Car {
	Engine engine;

	public Bmw(Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String getdetail() {
		// TODO Auto-generated method stub
		return "BMW – The “Ultimate Driving Machine,” blending sporty precision with luxury";
	}

}
