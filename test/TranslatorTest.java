
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
}