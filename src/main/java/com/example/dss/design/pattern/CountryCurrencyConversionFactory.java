package com.example.dss.design.pattern;

import com.example.dss.dao.ICountryConvertor;
import com.example.dss.dao.impl.DollarToEuro;
import com.example.dss.dao.impl.DollarToPound;
import com.example.dss.dao.impl.EuroToDollar;
import com.example.dss.dao.impl.EuroToPound;
import com.example.dss.dao.impl.PoundToDollar;
import com.example.dss.dao.impl.PoundToEuro;

public class CountryCurrencyConversionFactory {

	public static ICountryConvertor getCalculate(String type) {
		if (type == null) {
			return null;
		}

		if (type.equalsIgnoreCase("a")) {
			return new DollarToPound();
		} else if (type.equalsIgnoreCase("b")) {
			return new DollarToEuro();
		} else if (type.equalsIgnoreCase("c")) {
			return new PoundToDollar();
		} else if (type.equalsIgnoreCase("d")) {
			return new PoundToEuro();
		} else if (type.equalsIgnoreCase("e")) {
			return new EuroToDollar();
		} else if (type.equalsIgnoreCase("f")) {
			return new EuroToPound();
		}

		return null;
	}

}
