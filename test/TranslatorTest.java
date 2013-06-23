
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TranslatorTest {

	@Test
	public void oneToNine() {
		Assert.assertEquals("one", Translator.translate(1));
		Assert.assertEquals("two", Translator.translate(2));
		Assert.assertEquals("three", Translator.translate(3));
		Assert.assertEquals("four", Translator.translate(4));
		Assert.assertEquals("five", Translator.translate(5));
		Assert.assertEquals("six", Translator.translate(6));
		Assert.assertEquals("seven", Translator.translate(7));
		Assert.assertEquals("eight", Translator.translate(8));
		Assert.assertEquals("nine", Translator.translate(9));
	}

	@Test
	public void oneHundredToNineHundred() {
		Assert.assertEquals("one hundred", Translator.translate(100));
		Assert.assertEquals("two hundred", Translator.translate(200));
		Assert.assertEquals("three hundred", Translator.translate(300));
		Assert.assertEquals("four hundred", Translator.translate(400));
		Assert.assertEquals("five hundred", Translator.translate(500));
		Assert.assertEquals("six hundred", Translator.translate(600));
		Assert.assertEquals("seven hundred", Translator.translate(700));
		Assert.assertEquals("eight hundred", Translator.translate(800));
		Assert.assertEquals("nine hundred", Translator.translate(900));
	}
	
	@Test
	public void oneHundredAndOneToNineHundredAndNine() {
		Assert.assertEquals("one hundred and one", Translator.translate(101));
		Assert.assertEquals("two hundred and two", Translator.translate(202));
		Assert.assertEquals("three hundred and three", Translator.translate(303));
		Assert.assertEquals("four hundred and four", Translator.translate(404));
		Assert.assertEquals("five hundred and five", Translator.translate(505));
		Assert.assertEquals("six hundred and six", Translator.translate(606));
		Assert.assertEquals("seven hundred and seven", Translator.translate(707));
		Assert.assertEquals("eight hundred and eight", Translator.translate(808));
		Assert.assertEquals("nine hundred and nine", Translator.translate(909));
	}
	
	@Test
	public void oneThousandToNineThousand() {
		Assert.assertEquals("one thousand", Translator.translate(1000));
		Assert.assertEquals("two thousand", Translator.translate(2000));
		Assert.assertEquals("three thousand", Translator.translate(3000));
		Assert.assertEquals("four thousand", Translator.translate(4000));
		Assert.assertEquals("five thousand", Translator.translate(5000));
		Assert.assertEquals("six thousand", Translator.translate(6000));
		Assert.assertEquals("seven thousand", Translator.translate(7000));
		Assert.assertEquals("eight thousand", Translator.translate(8000));
		Assert.assertEquals("nine thousand", Translator.translate(9000));
	}
	
	@Test
	public void oneHundredThousandToNineHundredThousand() {
		Assert.assertEquals("one hundred thousand", Translator.translate(100000));
		Assert.assertEquals("two hundred thousand", Translator.translate(200000));
		Assert.assertEquals("three hundred thousand", Translator.translate(300000));
		Assert.assertEquals("four hundred thousand", Translator.translate(400000));
		Assert.assertEquals("five hundred thousand", Translator.translate(500000));
		Assert.assertEquals("six hundred thousand", Translator.translate(600000));
		Assert.assertEquals("seven hundred thousand", Translator.translate(700000));
		Assert.assertEquals("eight hundred thousand", Translator.translate(800000));
		Assert.assertEquals("nine hundred thousand", Translator.translate(900000));
	}		
	
	@Test
	public void oneThousandAndOneToNineThousandAndNine() {
		Assert.assertEquals("one thousand and one", Translator.translate(1001));
		Assert.assertEquals("two thousand and two", Translator.translate(2002));
		Assert.assertEquals("three thousand and three", Translator.translate(3003));
		Assert.assertEquals("four thousand and four", Translator.translate(4004));
		Assert.assertEquals("five thousand and five", Translator.translate(5005));
		Assert.assertEquals("six thousand and six", Translator.translate(6006));
		Assert.assertEquals("seven thousand and seven", Translator.translate(7007));
		Assert.assertEquals("eight thousand and eight", Translator.translate(8008));
		Assert.assertEquals("nine thousand and nine", Translator.translate(9009));
	}		
	
	public void thousandsAndNumber() {
		Assert.assertEquals("one thousand two hundred", Translator.translate(1200));
		Assert.assertEquals("two thousand three hundred", Translator.translate(2300));
		Assert.assertEquals("three thousand four hundred", Translator.translate(3400));
		Assert.assertEquals("four thousand five hundred", Translator.translate(4500));
		Assert.assertEquals("five thousand six hundred and one", Translator.translate(5601));
		Assert.assertEquals("six thousand seven hundred and eight", Translator.translate(6708));
		Assert.assertEquals("seven thousand and one", Translator.translate(7001));
		Assert.assertEquals("eight thousand and two", Translator.translate(8002));
	}
	
	@Test
	public void oneMillionToNineMillion() {
		Assert.assertEquals("one million", Translator.translate(1000000));
		Assert.assertEquals("two million", Translator.translate(2000000));
		Assert.assertEquals("three million", Translator.translate(3000000));
		Assert.assertEquals("four million", Translator.translate(4000000));
		Assert.assertEquals("five million", Translator.translate(5000000));
		Assert.assertEquals("six million", Translator.translate(6000000));
		Assert.assertEquals("seven million", Translator.translate(7000000));
		Assert.assertEquals("eight million", Translator.translate(8000000));
		Assert.assertEquals("nine million", Translator.translate(9000000));
	}	
	
	@Test
	public void oneMillionAndOneToNineMillionAndNine() {
		Assert.assertEquals("one million and one", Translator.translate(1000001));
		Assert.assertEquals("two million and two", Translator.translate(2000002));
		Assert.assertEquals("three million and three", Translator.translate(3000003));
		Assert.assertEquals("four million and four", Translator.translate(4000004));
		Assert.assertEquals("five million and five", Translator.translate(5000005));
		Assert.assertEquals("six million and six", Translator.translate(6000006));
		Assert.assertEquals("seven million and seven", Translator.translate(7000007));
		Assert.assertEquals("eight million and eight", Translator.translate(8000008));
		Assert.assertEquals("nine million and nine", Translator.translate(9000009));
	}	
	
	@Test
	public void millionThousandAndNumber() {
		Assert.assertEquals("one hundred million two thousand three hundred and four", Translator.translate(100002304));
		Assert.assertEquals("one hundred and eight million two thousand three hundred and four", Translator.translate(108002304));
		Assert.assertEquals("one hundred and five million two thousand three hundred and four", Translator.translate(105002304));
	}
	
	@Test
	public void tenToNineTeen() {
		Assert.assertEquals("ten", Translator.translate(10));
		Assert.assertEquals("eleven", Translator.translate(11));
		Assert.assertEquals("twelve", Translator.translate(12));
		Assert.assertEquals("thirteen", Translator.translate(13));
		Assert.assertEquals("fourteen", Translator.translate(14));
		Assert.assertEquals("fifteen", Translator.translate(15));
		Assert.assertEquals("sixteen", Translator.translate(16));
		Assert.assertEquals("seventeen", Translator.translate(17));
		Assert.assertEquals("eighteen", Translator.translate(18));
		Assert.assertEquals("nineteen", Translator.translate(19));
	}
	
	@Test
	public void twentyToNinety() {
		Assert.assertEquals("twenty", Translator.translate(20));
		Assert.assertEquals("thirty", Translator.translate(30));
		Assert.assertEquals("forty", Translator.translate(40));
		Assert.assertEquals("fifty", Translator.translate(50));
		Assert.assertEquals("sixty", Translator.translate(60));
		Assert.assertEquals("seventy", Translator.translate(70));
		Assert.assertEquals("eighty", Translator.translate(80));
		Assert.assertEquals("ninety", Translator.translate(90));
	}	
	
	@Test
	public void twentyOneToNinetySix() {
		Assert.assertEquals("twenty one", Translator.translate(21));
		Assert.assertEquals("thirty two", Translator.translate(32));
		Assert.assertEquals("forty three", Translator.translate(43));
		Assert.assertEquals("fifty four", Translator.translate(54));
		Assert.assertEquals("sixty five", Translator.translate(65));
		Assert.assertEquals("seventy six", Translator.translate(76));
		Assert.assertEquals("eighty seven", Translator.translate(87));
		Assert.assertEquals("ninety eight", Translator.translate(98));
	}		
	
	@Test
	public void oneHundredtwentyOneToEightHundredNinetySix() {
		Assert.assertEquals("one hundred and twenty one", Translator.translate(121));
		Assert.assertEquals("two hundred and thirty two", Translator.translate(232));
		Assert.assertEquals("three hundred and forty three", Translator.translate(343));
		Assert.assertEquals("four hundred and fifty four", Translator.translate(454));
		Assert.assertEquals("five hundred and sixty five", Translator.translate(565));
		Assert.assertEquals("six hundred and seventy six", Translator.translate(676));
		Assert.assertEquals("seven hundred and eighty seven", Translator.translate(787));
		Assert.assertEquals("eight hundred and ninety eight", Translator.translate(898));
	}		
	
	@Test
	public void challengeTest(){
		Assert.assertEquals("one", Translator.translate( 1));
		Assert.assertEquals("two", Translator.translate( 2));
		Assert.assertEquals("three", Translator.translate( 3));
		Assert.assertEquals("four", Translator.translate( 4));
		Assert.assertEquals("five", Translator.translate( 5));
		Assert.assertEquals("six", Translator.translate( 6));
		Assert.assertEquals("seven", Translator.translate( 7));
		Assert.assertEquals("eight", Translator.translate( 8));
		Assert.assertEquals("nine", Translator.translate( 9));
		Assert.assertEquals("ten", Translator.translate( 10));
		Assert.assertEquals("eleven", Translator.translate( 11));
		Assert.assertEquals("twelve", Translator.translate( 12));
		Assert.assertEquals("thirteen", Translator.translate( 13));
		Assert.assertEquals("fourteen", Translator.translate( 14));
		Assert.assertEquals("fifteen", Translator.translate( 15));
		Assert.assertEquals("sixteen", Translator.translate( 16));
		Assert.assertEquals("seventeen", Translator.translate( 17));
		Assert.assertEquals("eighteen", Translator.translate( 18));
		Assert.assertEquals("nineteen", Translator.translate( 19));
		Assert.assertEquals("twenty", Translator.translate( 20));
		Assert.assertEquals("twenty one", Translator.translate( 21));
		Assert.assertEquals("twenty two", Translator.translate( 22));
		Assert.assertEquals("twenty three", Translator.translate( 23));
		Assert.assertEquals("twenty four", Translator.translate( 24));
		Assert.assertEquals("twenty five", Translator.translate( 25));
		Assert.assertEquals("twenty six", Translator.translate( 26));
		Assert.assertEquals("twenty seven", Translator.translate( 27));
		Assert.assertEquals("twenty eight", Translator.translate( 28));
		Assert.assertEquals("twenty nine", Translator.translate( 29));
		Assert.assertEquals("thirty", Translator.translate( 30));
		Assert.assertEquals("thirty two", Translator.translate( 32));
		Assert.assertEquals("forty", Translator.translate( 40));
		Assert.assertEquals("forty three", Translator.translate( 43));
		Assert.assertEquals("fifty", Translator.translate( 50));
		Assert.assertEquals("fifty four", Translator.translate( 54));
		Assert.assertEquals("sixty", Translator.translate( 60));
		Assert.assertEquals("sixty five", Translator.translate( 65));
		Assert.assertEquals("seventy", Translator.translate( 70));
		Assert.assertEquals("seventy six", Translator.translate( 76));
		Assert.assertEquals("eighty", Translator.translate( 80));
		Assert.assertEquals("eighty seven", Translator.translate( 87));
		Assert.assertEquals("ninety", Translator.translate( 90));
		Assert.assertEquals("ninety eight", Translator.translate( 98));
		Assert.assertEquals("one hundred", Translator.translate( 100));
		Assert.assertEquals("one hundred and one", Translator.translate( 101));
		Assert.assertEquals("one hundred and ninety nine", Translator.translate( 199));
		Assert.assertEquals("one thousand", Translator.translate( 1000));
		Assert.assertEquals("one thousand and one", Translator.translate( 1001));
		Assert.assertEquals("one thousand and ninety nine", Translator.translate( 1099));
		Assert.assertEquals("ten thousand", Translator.translate( 10000));
		Assert.assertEquals("ten thousand and one", Translator.translate( 10001));
		Assert.assertEquals("ten thousand and ninety nine", Translator.translate( 10099));
		Assert.assertEquals("one hundred thousand", Translator.translate( 100000));
		Assert.assertEquals("one hundred thousand and one", Translator.translate( 100001));
		Assert.assertEquals("one million", Translator.translate( 1000000));
		Assert.assertEquals("one million and one", Translator.translate( 1000001));
		Assert.assertEquals("one million and ninety nine", Translator.translate( 1000099));
		Assert.assertEquals("one million one thousand and one", Translator.translate( 1001001));
		Assert.assertEquals("one million ninety nine thousand and one", Translator.translate( 1099001));
		Assert.assertEquals("one million ten thousand and one", Translator.translate( 1010001));
		Assert.assertEquals("one hundred and one million and one", Translator.translate( 101000001));
		Assert.assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", Translator.translate( 999999999));
	}	
}