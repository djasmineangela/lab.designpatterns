package com.bootcamp.lab.designpatterns.chainOfResponsibility;

import com.bootcamp.lab.designpatterns.chainOfResponsibility.bean.Number;
import com.bootcamp.lab.designpatterns.chainOfResponsibility.interfaces.Converter;

public abstract class AbstractNumberConverter {

	private Converter converter;
	private static final int TEN = 10;
	private static final int HUNDRED = 100;

	public void chain(Converter converter) {
		this.converter = converter;

	}

	public void display(Number number) {
		int num = number.getNumber();
		String wordValue = "";
		if (num >= getPlaceValue()) { // 11
			final int numberOfPlaceValue = num / getPlaceValue();
			final int remainingAmountToConvert = num % getPlaceValue();

			if (getPlaceValue() == TEN) {
				wordValue = convertHundredPlaceValue(num);
			} else {
				wordValue = convertHundredPlaceValue(numberOfPlaceValue);
			}

			System.out.print(wordValue + getNumberAppend());

			if (remainingAmountToConvert > 0 && getPlaceValue() != TEN) {
				converter.display(new Number(remainingAmountToConvert));
			}

		} else if (getPlaceValue() == TEN) {
			wordValue = convertHundredPlaceValue(num);
			System.out.print(wordValue + getNumberAppend());
		} else {
			converter.display(number);
		}
	}

	private String convertHundredPlaceValue(int num) {
		final int hundredsPlaceValue = num / HUNDRED;
		String wordValue = "";
		if (hundredsPlaceValue > 0) {
			wordValue = UnitsValue.getWordValue(hundredsPlaceValue) + " hundred ";

		}

		num = num % HUNDRED;
		if (num >= 20) {
			final int tensPlaceValue = num / TEN;
			wordValue += TensValue.getWordValue(tensPlaceValue);
			num = num % TEN;

			if (num > 0) {
				wordValue += "-" + UnitsValue.getWordValue(num) + " ";
			}
		} else {
			wordValue += UnitsValue.getWordValue(num) + " ";
		}
		return wordValue;
	}

	public abstract int getPlaceValue();

	public abstract String getNumberAppend();
}
