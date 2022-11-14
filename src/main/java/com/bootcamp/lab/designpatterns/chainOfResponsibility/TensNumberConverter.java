package com.bootcamp.lab.designpatterns.chainOfResponsibility;

//import com.bootcamp.lab.designpatterns.chainOfResponsibility.bean.Number;
import com.bootcamp.lab.designpatterns.chainOfResponsibility.interfaces.Converter;

public class TensNumberConverter extends AbstractNumberConverter implements Converter {
//	private Converter converter;
	private static final int TEN = 10;

	@Override
	public int getPlaceValue() {
		// TODO Auto-generated method stub
		return TEN;
	}

	@Override
	public String getNumberAppend() {
		// TODO Auto-generated method stub
		return "";
	}
	
//	@Override
//	public void chain(Converter converter) {
//		this.converter = converter;
//
//	}
//
//	@Override
//	public void display(Number number) {
//		int num = number.getNumber();
//		final int numberOfPlaceValue = num / TEN;
//		final int remainingAmountToConvert = num % TEN;
//		
//		if (num >= 20) {
//			String wordValue = TensValue.getWordValue(numberOfPlaceValue);
//			System.out.print(wordValue + " ");
//
//			if (remainingAmountToConvert > 0) {
//				converter.display(new Number(remainingAmountToConvert));
//			}
//
//		} else {
//			converter.display(number);
//		}
//		
//		if (num < 20) {
//			String wordValue = UnitsValue.getWordValue(num);
//			System.out.print(wordValue);
////			converter.display(number);
////			if (remainingAmountToConvert > 0) {
////				converter.display(new Number(remainingAmountToConvert));
////			}
//		} else {
//			converter.display(number);
//		}

//	}
//		if (num < 20) { // teen
//			String wordValue = UnitsValue.getWordValue(num);
//			System.out.println(wordValue);
//		} else if (num >= 20) {
//			final int numberOfPlaceValue = num / TEN;
//			final int remainingAmountToConvert = num % TEN;
//			String wordValue = TensValue.getWordValue(numberOfPlaceValue);
//			System.out.print(wordValue);
//			if (remainingAmountToConvert > 0) {
//				wordValue += "-" + TensValue.getWordValue(remainingAmountToConvert);
//				System.out.println(wordValue);
//			}
//		} else {
//			converter.display(number);
//		}
//	}

}
