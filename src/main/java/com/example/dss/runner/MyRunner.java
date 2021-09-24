package com.example.dss.runner;

import java.math.BigDecimal;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.dss.dao.ICountryConvertor;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	ICountryConvertor convertor;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello from runner class ");

		Boolean isValidCountry = Boolean.FALSE;

		System.out.println("Type any one Country counversion out of this : ");
		System.out.println("a) "+ICountryConvertor.DOLLAR_TO_POUND);
		System.out.println("b) "+ICountryConvertor.DOLLAR_TO_EURO);
		
		System.out.println("c) "+ICountryConvertor.POUND_TO_DOLLAR);
		System.out.println("d) "+ICountryConvertor.POUND_TO_EURO);
		
		System.out.println("e) "+ICountryConvertor.EURO_TO_DOLLAR);
		System.out.println("f) "+ICountryConvertor.EURO_TO_POUND);
		
		System.out.println("------------------------------");

		Scanner country = new Scanner(System.in);
		String selectedCCCode = country.next();

		if (ICountryConvertor.setOfCurrencyConversionCodeNames.contains(selectedCCCode)) {
			isValidCountry = Boolean.TRUE;
		}

		if (isValidCountry) {
			System.out.println("Please enter amount to convert: ");
			Scanner scAmt = new Scanner(System.in);
			BigDecimal enteredAmt = scAmt.nextBigDecimal();
//
////			To avoid object creation, use static method and called at line no. 39
////			CountryFactory factory = new CountryFactory();
//
			convertor = com.example.dss.design.pattern.CountryCurrencyConversionFactory.getCalculate(selectedCCCode);
			convertor.calculateAmount(enteredAmt);

			country.close();
			scAmt.close();
		} else {
			System.out.println("Invalid Input...");
		}

	}

}
