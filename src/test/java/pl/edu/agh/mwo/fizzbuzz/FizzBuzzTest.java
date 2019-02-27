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
		Assert.assertTrue(fizzbuzz.isMultipleOf(9, 3));
		Assert.assertTrue(fizzbuzz.isMultipleOf(12, 3));
		Assert.assertTrue(fizzbuzz.isMultipleOf(21, 3));
		Assert.assertFalse(fizzbuzz.isMultipleOf(20, 3));
	}
	
	@Test
	public void testIsMultipleOfFive() {
		Assert.assertTrue(fizzbuzz.isMultipleOf(5, 5));
		Assert.assertTrue(fizzbuzz.isMultipleOf(15, 5));
		Assert.assertTrue(fizzbuzz.isMultipleOf(30, 5));
		Assert.assertFalse(fizzbuzz.isMultipleOf(14, 5));
	}

	@Test
	public void testIsMultipleOfThreeAndFive() {
		Assert.assertTrue(fizzbuzz.isMultipleOf(15, 3, 5));
		Assert.assertTrue(fizzbuzz.isMultipleOf(30, 3, 5));
		Assert.assertTrue(fizzbuzz.isMultipleOf(45, 3, 5));
		Assert.assertFalse(fizzbuzz.isMultipleOf(43, 3, 5));
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
