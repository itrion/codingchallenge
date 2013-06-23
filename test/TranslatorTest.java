
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

}