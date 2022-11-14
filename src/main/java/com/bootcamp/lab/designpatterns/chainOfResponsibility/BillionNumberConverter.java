package com.bootcamp.lab.designpatterns.chainOfResponsibility;

//import com.bootcamp.lab.designpatterns.chainOfResponsibility.bean.Number;
import com.bootcamp.lab.designpatterns.chainOfResponsibility.interfaces.Converter;


public class BillionNumberConverter extends AbstractNumberConverter implements Converter {
//	private Converter converter;
	private static final int BILLION = 1_000_000_000;
	
	@Override
	public int getPlaceValue() {
		// TODO Auto-generated method stub
		return BILLION;
	}

	@Override
	public String getNumberAppend() {
		// TODO Auto-generated method stub
		return "billion ";
	}

//	public void chain(Converter converter) {
//		this.converter = converter;
//
//	}
//
//	public void display(Number number) {
//		int num = number.getNumber();
//		if (num >= BILLION) {
//			final int numberOfPlaceValue = num / BILLION;
//			final int remainingAmountToConvert = num % BILLION;
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
//	
	
	

//	@Override
//	public int getPlaceValue() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
