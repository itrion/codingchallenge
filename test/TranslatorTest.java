
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
}