public class Translator {

	public static String translate(int n) {
		return	(words(n / 1000000, " million" + ((n % 1000000 > 0) && (n % 1000000 < 100) ? " and " : " ")) + 
			words((n % 1000000) / 1000, " thousand" + ((n % 1000 > 0) && (n % 1000 < 100) ? " and " : " ")) + 
			words(n % 1000, "")).replace("  ", " ").trim();
	}

	private static String words(int n, String ending) {
		String[] numbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tenSet = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		return (n == 0) ? "" : ((n >= 100) ? numbers[n / 100] + " hundred" + ((n % 100 > 0) && (n % 100 < 100) ? " and " : " ") : "") + 
			   (((n % 100) >= 20) ? tenSet[(n % 100) / 10] + " " + numbers[n % 10] : numbers[n % 20]) + ending;
	}
}
