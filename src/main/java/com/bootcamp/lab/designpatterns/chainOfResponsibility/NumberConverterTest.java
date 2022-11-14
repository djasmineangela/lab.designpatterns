package com.bootcamp.lab.designpatterns.chainOfResponsibility;

import java.util.Scanner;

import com.bootcamp.lab.designpatterns.chainOfResponsibility.bean.Number;
import com.bootcamp.lab.designpatterns.chainOfResponsibility.interfaces.Converter;

public class NumberConverterTest {
	private Converter millionNumberConverter;
	private Converter thousandNumberConverter;
	private Converter hundredNumberConverter;
	private Converter tensNumberConverter;

	public NumberConverterTest() {
		this.millionNumberConverter = new MillionNumberConverter();
		this.thousandNumberConverter = new ThousandNumberConverter();
		this.hundredNumberConverter = new HundredNumberConverter();
		this.tensNumberConverter = new TensNumberConverter();

		this.millionNumberConverter.chain(thousandNumberConverter);
		this.thousandNumberConverter.chain(hundredNumberConverter);
		this.hundredNumberConverter.chain(tensNumberConverter);
	}

	public void convertNumber(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Number should not be a negative integer");
		} else if (number > 2_147_483_647) {
			throw new IllegalArgumentException("Number is out of range");
		}
		
		this.millionNumberConverter.display(new Number(number));
	}

	public static void main(String[] args) {
		NumberConverterTest numberConverter = new NumberConverterTest();
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter number to convert: ");
            int number = in.nextInt();
            numberConverter.convertNumber(number);
            
            in.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage() );
		}
	}
}
