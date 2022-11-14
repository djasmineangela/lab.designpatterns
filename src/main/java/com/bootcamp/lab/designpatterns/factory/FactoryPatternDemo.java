package com.bootcamp.lab.designpatterns.factory;

import com.bootcamp.lab.designpatterns.factory.factory.ShapeFactory;
import com.bootcamp.lab.designpatterns.factory.factory.Shapes;
import com.bootcamp.lab.designpatterns.factory.interfaces.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = ShapeFactory.newInstance();
		Shape circle = shapeFactory.getShape(Shapes.CIRCLE);
		circle.draw();
		Shape square = shapeFactory.getShape(Shapes.SQUARE);
		square.draw();
		Shape rectangle = shapeFactory.getShape(Shapes.RECTANGLE);
		rectangle.draw();
		
	}

}
