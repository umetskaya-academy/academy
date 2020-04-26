package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	@Override
	public boolean validate(String string) {
		Pattern p = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = p.matcher(string);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}

}
