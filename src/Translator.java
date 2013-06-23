public class Translator {

	public static String translate(int number) {
		return	(words(number / 1000000, " million" + and(number % 1000000)) + 
				words((number % 1000000) / 1000, " thousand" + and(number % 1000)) + 
				words(number % 1000, "")).replace("  ", " ").trim();
	}

	private static String and(int number) {
		return (number > 0) && (number < 100) ? " and " : " ";
	}

	private static String words(int number, String ending) {
		if (number == 0) return "";
		String[] numbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		return ((number >= 100) ? numbers[number / 100] + " hundred" + and(number % 100) + numbers[number % 100] : numbers[number]) + ending;
	}
}
