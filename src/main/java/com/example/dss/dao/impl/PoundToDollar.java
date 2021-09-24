package com.example.dss.dao.impl;

import java.math.BigDecimal;

import com.example.dss.dao.ICountryConvertor;

public class PoundToDollar implements ICountryConvertor {

	BigDecimal valueOfPoundToDollar = BigDecimal.valueOf(1.37);
	
	@Override
	public void calculateAmount(BigDecimal amount) {
		BigDecimal convertedAmount = amount.multiply(valueOfPoundToDollar);
		System.out.println("amount converted into Dollar " + convertedAmount + " $");

	}

}
