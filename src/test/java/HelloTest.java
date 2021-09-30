import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloTest {

	@Test
	@DisplayName("ทดสอบ Junit 5")
	public void case01() {
		Hello hello = new Hello();
		String result = hello.say("Arsom");
		assertEquals("Hello Arsom", result);
	}
}
