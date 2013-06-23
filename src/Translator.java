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
		String[] numbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tenSet = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		if (number >= 100)
			return numbers[number / 100] + " hundred" + and(number % 100) + words(number % 100, "") + ending;
		if (number >= 20)
			return tenSet[number / 10] + " " + words(number % 10, "") + ending;
		else
			return numbers[number]+ ending;
	}
}
