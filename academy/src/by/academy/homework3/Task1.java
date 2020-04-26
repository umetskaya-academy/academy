package by.academy.homework3;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 1.

//Дан текст:
//
//Iron Man is a 2008 American superhero film based on the Marvel Comics character of the same name. Produced by Marvel Studios and distributed by Paramount Pictures,[N 1] it is the first film in the Marvel Cinematic Universe. It was directed by Jon Favreau from a screenplay by the writing teams of Mark Fergus and Hawk Ostby, and Art Marcum and Matt Holloway, and stars Robert Downey Jr. as Tony Stark / Iron Man alongside Terrence Howard, Jeff Bridges, Shaun Toub, and Gwyneth Paltrow. In the film, following his escape captivity from a terrorist group, world famous industrialist and master engineer Tony Stark builds a mechanized suit of armor and becomes the superhero Iron Man.
//
//A film featuring the character was in development at Universal Pictures, 20th Century Fox, and New Line Cinema at various times since 1990, before Marvel Studios reacquired the rights in 2006. Marvel put the project in production as its first self-financed film, with Paramount Pictures distributing. Favreau signed on as director in April 2006, and faced opposition from Marvel when trying to cast Downey in the title role; the actor was signed in September. Filming took place from March to June 2007, primarily in California to differentiate the film from numerous other superhero stories that are set in New York City-esque environments. During filming, the actors were free to create their own dialogue because pre-production was focused on the story and action. Rubber and metal versions of the armor, created by Stan Winston's company, were mixed with computer-generated imagery to create the title character.
//
//Iron Man premiered in Sydney on April 14, 2008, and was released in the United States on May 2, as the first film in Phase One of the MCU. It grossed over $585 million on its $140 million budget, becoming the eighth-highest grossing film of 2008. The film was praised by critics for its acting (particularly Downey's), screenplay, direction, visual effects, and action sequences. It was selected by the American Film Institute as one of the ten best films of 2008 and received two nominations at the 81st Academy Awards for Best Sound Editing and Best Visual Effects. It was followed by two sequels, Iron Man 2 in 2010 and Iron Man 3 in 2013.
//
//Задание: найти все слова в тексте, которые начинаются на a, b, c (регистр не важен), закинуть в StringBuilder, разделяя пробелами, вывести на экран.
//Сделать 2-мя способами:
//1)	Split
//2)	regExp

public class Task1 {

	public static void main(String[] args) {
		String str = "Iron Man is a 2008 American superhero film based on the Marvel Comics character of the same name. "
				+ "Produced by Marvel Studios and distributed by Paramount Pictures,[N 1] it is the first film in the Marvel Cinematic Universe. "
				+ "It was directed by Jon Favreau from a screenplay by the writing teams of Mark Fergus and Hawk Ostby, and Art Marcum and Matt Holloway, and stars Robert Downey Jr. as Tony Stark / Iron Man alongside Terrence Howard, Jeff Bridges, Shaun Toub, and Gwyneth Paltrow. In the film, following his escape captivity from a terrorist group, world famous industrialist and master engineer Tony Stark builds a mechanized suit of armor and becomes the superhero Iron Man.\r\n"
				+ "\r\n"
				+ "A film featuring the character was in development at Universal Pictures, 20th Century Fox, and New Line Cinema at various times since 1990, before Marvel Studios reacquired the rights in 2006. Marvel put the project in production as its first self-financed film, with Paramount Pictures distributing. Favreau signed on as director in April 2006, and faced opposition from Marvel when trying to cast Downey in the title role; the actor was signed in September. "
				+ "Filming took place from March to June 2007, primarily in California to differentiate the film from numerous other superhero stories that are set in New York City-esque environments. "
				+ "During filming, the actors were free to create their own dialogue because pre-production was focused on the story and action. "
				+ "Rubber and metal versions of the armor, created by Stan Winston's company, were mixed with computer-generated imagery to create the title character.\r\n"
				+ "\r\n"
				+ "Iron Man premiered in Sydney on April 14, 2008, and was released in the United States on May 2, as the first film in Phase One of the MCU. "
				+ "It grossed over $585 million on its $140 million budget, becoming the eighth-highest grossing film of 2008. "
				+ "The film was praised by critics for its acting (particularly Downey's), screenplay, direction, visual effects, and action sequences. "
				+ "It was selected by the American Film Institute as one of the ten best films of 2008 and received two nominations at the 81st Academy Awards for Best Sound Editing and Best Visual Effects. "
				+ "It was followed by two sequels, Iron Man 2 in 2010 and Iron Man 3 in 2013.\r\n";

		String[] strings = str.split("\\s");
		System.out.println(Arrays.toString(strings));
		StringBuilder strBuilder = new StringBuilder();
		for (String word : strings) {
			if (word.length() == 0) {
				continue;
			}
			char c = word.charAt(0);

			if (c == 'a' || c == 'b' || c == 'c') {
				strBuilder.append(word).append(" ");
			}

		}

		System.out.println(strBuilder);
	}

	public static void newStringRegExp(String str) {
		Pattern p = Pattern.compile("\\b([a-cA-C]\\w*)\\b");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.print(m.group() + " ");
		}
	}

}
