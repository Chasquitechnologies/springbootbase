package com.chasquitech.base.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class AppProperties {

	private static String emailValidationError;

	public String getEmailValidationError() {
		return emailValidationError;
	}

	public void setEmailValidationError(String emailValidationError) {
		this.emailValidationError = emailValidationError;
	}
	
}
