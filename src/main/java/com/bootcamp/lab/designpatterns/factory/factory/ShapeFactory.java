package com.bootcamp.lab.designpatterns.factory.factory;

import com.bootcamp.lab.designpatterns.factory.bean.Circle;
import com.bootcamp.lab.designpatterns.factory.bean.Rectangle;
import com.bootcamp.lab.designpatterns.factory.bean.Square;
import com.bootcamp.lab.designpatterns.factory.interfaces.Shape;

public class ShapeFactory {
	
	private static ShapeFactory INSTANCE;

    public static ShapeFactory newInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ShapeFactory();
        }
        return INSTANCE;
    }

    private ShapeFactory() {
    }

	public Shape getShape(Shapes type) {
		Shape shape = null;
		
		switch (type) {
		case CIRCLE:
			shape = new Circle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		}
		return shape;
	}
}
