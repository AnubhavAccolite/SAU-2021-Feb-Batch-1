package primeExceptions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeTest {
	@Test
	void test() {
		checkPrime test=new checkPrime();
		boolean output=test.check(5);
		assertEquals(true, output);
	}
}
