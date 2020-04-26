package by.academy.homework3;

//Написать класс BelarusPhoneValidator, который валидирует белорусский телефон(начинающийся на +375...) 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	@Override
	public boolean validate(String string) {

		Pattern pattern = Pattern.compile("^(\\+375)(29|25|44|33)(\\d{3})(\\d{2})(\\d{2})$");
		Matcher matcher = pattern.matcher(string);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
}
