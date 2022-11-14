package com.bootcamp.lab.designpatterns.chainOfResponsibility;

import com.bootcamp.lab.designpatterns.chainOfResponsibility.bean.Number;
import com.bootcamp.lab.designpatterns.chainOfResponsibility.interfaces.Converter;

public class OnesNumberConverter implements Converter {
	private Converter converter;
	private static final int TWENTY = 20;

	@Override
	public void chain(Converter converter) {
		this.converter = converter;

	}

	@Override
	public void display(Number number) {
		int num = number.getNumber();
		String wordValue = "";
		if (num < TWENTY) {

			wordValue += UnitsValue.getWordValue(num);
			System.out.println(wordValue);

//			if (remainingAmountToConvert > 0) {
//				converter.display(new Number(num));
			

		} else if (num > TWENTY) {
			wordValue += TensValue.getWordValue(num%10);
			System.out.println("-" +wordValue);
		}
		
		else {
			converter.display(number);
		}
	}

}
