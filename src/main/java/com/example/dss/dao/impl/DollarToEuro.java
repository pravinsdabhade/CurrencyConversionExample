package com.example.dss.dao.impl;

import java.math.BigDecimal;

import com.example.dss.dao.ICountryConvertor;

public class DollarToEuro implements ICountryConvertor {
	
	BigDecimal valueOfDollarToEuro = BigDecimal.valueOf(0.85);

	@Override
	public void calculateAmount(BigDecimal amount) {
		BigDecimal convertedAmount = amount.multiply(valueOfDollarToEuro);
		System.out.println("amount converted into Euro "
				+ convertedAmount+ " €");

	}

}
