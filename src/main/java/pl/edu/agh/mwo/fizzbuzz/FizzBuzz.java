package pl.edu.agh.mwo.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.printn(100);
	}

	boolean isMultipleOf(int number, int... multiples) {
		for (int multiple : multiples) {
			if (number % multiple != 0)
				return false;
		}
		return true;
	}

	public String getLine(int number) {
		if (this.isMultipleOf(number, 3, 5)) {
			return "FizzBuzz";
		} else if (this.isMultipleOf(number, 3)) {
			return "Fizz";
		} else if (this.isMultipleOf(number, 5)) {
			return "Buzz";
		}
		return "";
	}

	public void printn(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.printf("%3d %-8s ", i, this.getLine(i));
			if (i % 5 == 0)
				System.out.println("\n");
		}
	}

}
