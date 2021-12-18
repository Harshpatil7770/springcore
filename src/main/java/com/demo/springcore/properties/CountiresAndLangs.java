package com.demo.springcore.properties;

import java.util.Properties;

public class CountiresAndLangs {

	private Properties countryAndLanguage;

	public Properties getCountryAndLanguage() {
		return countryAndLanguage;
	}

	public void setCountryAndLanguage(Properties countryAndLanguage) {
		this.countryAndLanguage = countryAndLanguage;
	}

	@Override
	public String toString() {
		return "CountiresAndLangs [countryAndLanguage=" + countryAndLanguage + "]";
	}

	
}
