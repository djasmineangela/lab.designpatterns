package com.bootcamp.lab.designpatterns.chainOfResponsibility;

//import com.bootcamp.lab.designpatterns.chainOfResponsibility.bean.Number;
import com.bootcamp.lab.designpatterns.chainOfResponsibility.interfaces.Converter;

public class HundredNumberConverter extends AbstractNumberConverter implements Converter {
//	private Converter converter;
	private static final int HUNDRED = 100;

	@Override
	public int getPlaceValue() {
		return HUNDRED;
	}

	@Override
	public String getNumberAppend() {
		// TODO Auto-generated method stub
		return "hundred ";
	}
	
	

}
