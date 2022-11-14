package com.bootcamp.lab.designpatterns.chainOfResponsibility.interfaces;

import com.bootcamp.lab.designpatterns.chainOfResponsibility.bean.Number;

public interface Converter {
	void chain(Converter converter);
	void display(Number number);
//	String checkAndSetTensValues(int num);
}
