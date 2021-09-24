package com.example.dss.dao.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.example.dss.dao.ICountryConvertor;


@Component
public class DollarToPound implements ICountryConvertor {

	BigDecimal valueOfDollarToPound = BigDecimal.valueOf(0.73);

	@Override
	public void calculateAmount(BigDecimal amount) {
		BigDecimal convertedAmount = amount.multiply(valueOfDollarToPound);
		System.out.println("amount converted into Pound "
				+ convertedAmount+ " £");
	}

}
