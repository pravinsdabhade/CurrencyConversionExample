package com.example.dss.dao;

import java.math.BigDecimal;
import java.util.Set;

@FunctionalInterface
public interface ICountryConvertor {
	
	Set<String> setOfCurrencyConversionCodeNames = Set.of("a","b","c","d","e","f");

	public final static String DOLLAR_TO_POUND = "dollarToPound";
	public final static String DOLLAR_TO_EURO = "dollarToEuro";
	
	public final static String POUND_TO_DOLLAR = "poundToDollar";
	public final static String POUND_TO_EURO = "poundToEuro";
	
	public final static String EURO_TO_DOLLAR = "euroToDollar";
	public final static String EURO_TO_POUND = "euroToPound";
	

	void calculateAmount(BigDecimal amount);

}
