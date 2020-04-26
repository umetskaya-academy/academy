package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать класс AmericanPhoneValidator, который валидирует американский телефон(начинающийся на +1...)
public class AmericanPhoneValidator implements Validator {

	@Override
	public boolean validate(String string) {

		Pattern pattern = Pattern.compile("^\\+1[ ]?[-\\(]?[2-9]\\d{2}[-\\)]?[ ]?[2-9]\\d{2}[ -]?\\d{4}");
		Matcher matcher = pattern.matcher(string);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
}
