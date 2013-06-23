public class Translator {

	public static String translate(int number) {
		String[] numbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		return ((number >= 100) ? numbers[number / 100] + " hundred" : numbers[number]);
	}

}
