package pl.edu.agh.mwo.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fizzbuzz;
	
	@Before
	public void createEmptyFizzBuzzBeforeTest() {
		fizzbuzz = new FizzBuzz();
	}
	
	@Test
	public void testIsMultipleOfThree() {
		Assert.assertTrue(fizzbuzz.isMultiple(9, 3));
		Assert.assertTrue(fizzbuzz.isMultiple(12, 3));
		Assert.assertTrue(fizzbuzz.isMultiple(21, 3));
		Assert.assertFalse(fizzbuzz.isMultiple(20, 3));
	}
	
	@Test
	public void testIsMultipleOfFive() {
		Assert.assertTrue(fizzbuzz.isMultiple(5, 5));
		Assert.assertTrue(fizzbuzz.isMultiple(15, 5));
		Assert.assertTrue(fizzbuzz.isMultiple(30, 5));
		Assert.assertFalse(fizzbuzz.isMultiple(14, 5));
	}

	@Test
	public void testIsMultipleOfThreeAndFive() {
		Assert.assertTrue(fizzbuzz.isMultiple(15, 3, 5));
		Assert.assertTrue(fizzbuzz.isMultiple(30, 3, 5));
		Assert.assertTrue(fizzbuzz.isMultiple(45, 3, 5));
		Assert.assertFalse(fizzbuzz.isMultiple(43, 3, 5));
	}
	
	@Test
	public void testPrintsFizzForMultiplesOfThree() {
		Assert.assertEquals(fizzbuzz.getLine(3), "Fizz");
		Assert.assertEquals(fizzbuzz.getLine(9), "Fizz");
	}

	@Test
	public void testPrintsBuzzForMultiplesOfFive() {
		Assert.assertEquals(fizzbuzz.getLine(5), "Buzz");
		Assert.assertEquals(fizzbuzz.getLine(10), "Buzz");
	}
	
	@Test
	public void testPrintsFizzBuzzForMultiplesOfThreeAndFive() {
		Assert.assertEquals(fizzbuzz.getLine(15), "FizzBuzz");
		Assert.assertEquals(fizzbuzz.getLine(30), "FizzBuzz");
	}
}
