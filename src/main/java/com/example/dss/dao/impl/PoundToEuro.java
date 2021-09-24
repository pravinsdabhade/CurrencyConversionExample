package com.example.dss.dao.impl;

import java.math.BigDecimal;

import com.example.dss.dao.ICountryConvertor;

public class PoundToEuro implements ICountryConvertor {

	BigDecimal valueOfPoundToEuro = BigDecimal.valueOf(1.17);

	@Override
	public void calculateAmount(BigDecimal amount) {
		BigDecimal convertedAmount = amount.multiply(valueOfPoundToEuro);
		System.out.println("amount converted into Euro " + convertedAmount + " €");
	}

}
