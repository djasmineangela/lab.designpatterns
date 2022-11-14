package com.bootcamp.lab.designpatterns.chainOfResponsibility;

//import com.bootcamp.lab.designpatterns.chainOfResponsibility.bean.Number;
import com.bootcamp.lab.designpatterns.chainOfResponsibility.interfaces.Converter;


public class MillionNumberConverter extends AbstractNumberConverter implements Converter {
//	private Converter converter;
	private static final int MILLION = 1_000_000;
//	private static final int TEN = 10;

	@Override
	public int getPlaceValue() {
		// TODO Auto-generated method stub
		return MILLION;
	}

	@Override
	public String getNumberAppend() {
		// TODO Auto-generated method stub
		return "million ";
	}

//	public void chain(Converter converter) {
//		this.converter = converter;
//
//	}
//
//	public void display(Number number) {
//		int num = number.getNumber();
//		if (num >= MILLION) {
//			final int numberOfPlaceValue = num / MILLION;
//			final int remainingAmountToConvert = num % MILLION;
//			String wordValue ="";
//			if (numberOfPlaceValue < 20) {
//				wordValue = UnitsValue.getWordValue(numberOfPlaceValue);
//			} else {
//				final int numberOfTensValue = numberOfPlaceValue / TEN;
//				final int onesValuesToConvert = numberOfPlaceValue % TEN;
//				wordValue = TensValue.getWordValue(numberOfTensValue);
//				if (onesValuesToConvert > 0) {
//					wordValue += "-" + UnitsValue.getWordValue(onesValuesToConvert);
//				}
//			}
//			
//			System.out.print(wordValue + " million ");
//			
//			if (remainingAmountToConvert > 0) {
//                converter.display(new Number(remainingAmountToConvert));
//            }
//			
//		} else {
//			converter.display(number);
//        }
//	}
	
	
	

//	@Override
//	public int getPlaceValue() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
