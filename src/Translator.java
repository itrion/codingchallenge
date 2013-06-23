public class Translator {

	public static String translate(int number) {
		return	(words(number / 1000000, " million" + and(number % 1000000)) + 
				words((number % 1000000) / 1000, " thousand" + and(number % 1000)) + 
				words(number % 1000, "")).replace("  ", " ").trim();
	}

	private static String and(int number) {
		return (number > 0) && (number < 100) ? " and " : " ";
	}

	private static String words(int n, String ending) {
		if (n == 0) return "";
		String[] numbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tenSet = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		return ((n >= 100) ? numbers[n / 100] + " hundred" + and(n % 100) : "") + 
			   (((n % 100) >= 20) ? tenSet[(n % 100) / 10] + " " + numbers[n % 10] : numbers[n % 20]) + ending;
	}
}
