package by.academy.homework3;
public class Main {

	public static void main(String[] args) {
		
		BelarusPhoneValidator bV = new BelarusPhoneValidator();
		System.out.println(bV.validate("+375 44 333 00 11"));
		System.out.println(bV.validate("+375443330011"));
		System.out.println(bV.validate("+375(44)333 00 11"));
		
		System.out.println();
		
		AmericanPhoneValidator aV = new AmericanPhoneValidator();
		System.out.println(aV.validate("+1-111-222-3333"));	
		System.out.println(aV.validate("+1 (111) 222 3333")); 	
		System.out.println(aV.validate("+1-111-222-3333")); 
		
		System.out.println();
		
		EmailValidator emailV = new EmailValidator();
		System.out.println(emailV.validate("tensun@mail.by"));
		System.out.println(emailV.validate("tensun02541@gmail.com"));
		System.out.println(emailV.validate("ten.sun@cool-sun.by"));
	}

}