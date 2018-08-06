package test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import main.CreatePhoneNumberKata;

public class CreatePhoneNumberKataTest {

	@Test
	void intArrayTest1() {
		String phoneNumber = CreatePhoneNumberKata.createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });
		Assert.assertTrue(phoneNumber.equals("(123) 456-7890"));
	}

	@Test
	void intArrayTest2() {
		String phoneNumber = CreatePhoneNumberKata.createPhoneNumber(new int[] { 0, 9, 8, 7, 6, 5, 4, 3, 2, 1 });
		Assert.assertTrue(phoneNumber.equals("(098) 765-4321"));
	}

	@Test
	void intBigArrayTest() {
		String phoneNumber = CreatePhoneNumberKata
				.createPhoneNumber(new int[] { 0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 2, 3, 4 });
		Assert.assertTrue(phoneNumber.equals("(098) 765-4321"));
	}

	@Test
	void indexOutOfBoundsExceptionTest1() {
		Executable testCode = () -> CreatePhoneNumberKata.createPhoneNumber(new int[] { 0, 9, 8, 7, 6 });
		Assertions.assertThrows(IndexOutOfBoundsException.class, testCode);
	}

	@Test
	void illegalArgumentExceptionTest() {
		Executable testCode = () -> CreatePhoneNumberKata.createPhoneNumber(new int[] { '1', '2' });
		Assertions.assertThrows(IllegalArgumentException.class, testCode);
	}

	@Test
	void bigNumberTest() {
		Executable testCode = () -> CreatePhoneNumberKata
				.createPhoneNumber(new int[] { 123, 123, 123, 3, 4, 5, 6, 7, 8, 9 });
		Assertions.assertThrows(IllegalArgumentException.class, testCode);
	}
}
