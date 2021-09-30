import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {
	
	@Test
	@DisplayName("ตัวแรกเป็น [ ,input [1,5] , result = true")
	public void case01() {
		MyRange range = new MyRange("[1,5]");
		boolean result = range.startWithInclude();
		assertTrue(result);
	}

	@Test
	@DisplayName("ตัวแรกเป็น [ input (1,5] , result = false ")
	public void case02() {
		MyRange range = new MyRange("(1,5]");
		boolean result = range.startWithInclude();
		assertFalse(result);
	}

	@Test
	@DisplayName("ตัวเลขเริ่มต้น เป็น 1 , input = [1,5] , result = 1 ")
	public void case03() {
		MyRange range = new MyRange("[1,5]");
		int result = range.getStart();
		assertEquals(1,result);
	}

	@Test
	@DisplayName("ตัวเลขเริ่มต้น เป็น 1 , input = (1,5] , result = 2 ")
	public void case04() {
		MyRange range = new MyRange("(1,5]");
		int result = range.getStart();
		assertEquals(2,result);
	}

	@Test
	@DisplayName("ตัวเลขสุดท้าย เป็น ], input = (1,5] , result = true ")
	public void case05() {
		MyRange range = new MyRange("(1,5]");
		boolean result = range.endWithInclude();
		assertTrue(result);
	}

	@Test
	@DisplayName("ตัวเลขสุดท้าย เป็น ], input = (1,5) , result = false ")
	public void case06() {
		MyRange range = new MyRange("(1,5)");
		boolean result = range.endWithInclude();
		assertFalse(result);
	}

	@Test
	@DisplayName("ตัวเลขสุดท้าย เป็น ), input = (1,5) , result = true ")
	public void case07() {
		MyRange range = new MyRange("(1,5)");
		boolean result = range.endWithExclude();
		assertFalse(result);
	}



}
