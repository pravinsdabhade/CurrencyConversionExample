package com.example.dss.dao.impl;

import java.math.BigDecimal;

import com.example.dss.dao.ICountryConvertor;

public class EuroToPound implements ICountryConvertor {

	BigDecimal valueOfEuroToPound = BigDecimal.valueOf(0.85);

	@Override
	public void calculateAmount(BigDecimal amount) {

		BigDecimal convertedAmount = amount.multiply(valueOfEuroToPound);
		System.out.println("amount converted into Pound " + convertedAmount + " £");
	}

}
