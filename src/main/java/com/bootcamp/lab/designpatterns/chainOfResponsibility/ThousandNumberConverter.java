package com.bootcamp.lab.designpatterns.chainOfResponsibility;

//import com.bootcamp.lab.designpatterns.chainOfResponsibility.bean.Number;
import com.bootcamp.lab.designpatterns.chainOfResponsibility.interfaces.Converter;

public class ThousandNumberConverter extends AbstractNumberConverter implements Converter {
	private static final int THOUSAND = 1_000;
	@Override
	public int getPlaceValue() {
		// TODO Auto-generated method stub
		return THOUSAND;
	}
	@Override
	public String getNumberAppend() {
		// TODO Auto-generated method stub
		return "thousand ";
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
//		if (num >= THOUSAND) {
//			final int numberOfPlaceValue = num / THOUSAND;
//			final int remainingAmountToConvert = num % THOUSAND;
//			String wordValue = "";
//			
//			wordValue = OnesTensValues.setValue(numberOfPlaceValue);
////			if (numberOfPlaceValue < 20) {
////				wordValue = UnitsValue.getWordValue(numberOfPlaceValue);
////			} else {
////				final int numberOfTensValue = numberOfPlaceValue / TEN;
////				final int onesValuesToConvert = numberOfPlaceValue % TEN;
////				wordValue = TensValue.getWordValue(numberOfTensValue);
////				if (onesValuesToConvert > 0) {
////					wordValue += "-" + UnitsValue.getWordValue(onesValuesToConvert);
////				}
////			}
//			System.out.print(wordValue + "thousand ");
//
//			if (remainingAmountToConvert > 0) {
//				converter.display(new Number(remainingAmountToConvert));
//			}
//
//		} else {
//			converter.display(number);
//		}
//	}

}
