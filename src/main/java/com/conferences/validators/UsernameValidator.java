package com.conferences.validators;

import org.apache.wicket.validation.CompoundValidator;
import org.apache.wicket.validation.validator.PatternValidator;
import org.apache.wicket.validation.validator.StringValidator;

public class UsernameValidator extends CompoundValidator<String> {

	private static final long serialVersionUID = 1L;

	public UsernameValidator() {

		add(StringValidator.lengthBetween(3, 15));
		add(new PatternValidator("[a-z0-9_-]+"));

	}
}