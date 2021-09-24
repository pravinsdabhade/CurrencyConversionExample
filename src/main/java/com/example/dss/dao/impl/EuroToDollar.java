package com.example.dss.dao.impl;

import java.math.BigDecimal;

import com.example.dss.dao.ICountryConvertor;

public class EuroToDollar implements ICountryConvertor {

	BigDecimal valueOfEuroToDollar = BigDecimal.valueOf(1.17);

	@Override
	public void calculateAmount(BigDecimal amount) {
		BigDecimal convertedAmount = amount.multiply(valueOfEuroToDollar);
		System.out.println("amount converted into Dollar " + convertedAmount + " $");

	}

}
