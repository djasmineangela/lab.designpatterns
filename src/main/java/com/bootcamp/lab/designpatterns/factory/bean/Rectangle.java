package com.bootcamp.lab.designpatterns.factory.bean;

import com.bootcamp.lab.designpatterns.factory.interfaces.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("This is a rectangle drawing");
		
	}

}
