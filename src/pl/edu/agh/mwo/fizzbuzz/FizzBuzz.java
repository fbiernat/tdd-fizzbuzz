package pl.edu.agh.mwo.fizzbuzz;

public class FizzBuzz {
	
	public boolean isMultiple(int number, int... multiples) {
		for (int multiple : multiples) {
			if (number % multiple != 0)
				return false;
		}
		return true;
	}
	
	public String getLine(int number) {
		if (this.isMultiple(number, 3, 5)) {
			return "FizzBuzz";
		} else if (this.isMultiple(number, 3)) {
			return "Fizz";
		} else if (this.isMultiple(number, 5)) {
			return "Buzz";
		}
		return String.valueOf(number);
	}
	
	public void print() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(this.getLine(i));
		}
	}
	
	public static void main(String[] args) {
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.print();
	}

}
