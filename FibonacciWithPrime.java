
public class FibonacciWithPrime {

	private void fibonacciWithPrime() {
		int fibonacciNumber = 0;
		int first = 0;
		int second = 1;
		for (int i = 0; i < 10; i++) {
			fibonacciNumber = first + second;
			first = second;
			second = fibonacciNumber;
			if (first != 1)
				if ((first < 10) && (first == 2 || first == 3 || (first % 6 == 1 || first % 6 == 5))) {
					System.out.print(first + " ");

				} else if ((first % 5 != 0) && (first % 7 != 0)
						&& (first == 2 || first == 3 || (first % 6 == 1 || first % 6 == 5)))
					System.out.print(first + " ");
		}
	}

	public static void main(String[] args) {
		FibonacciWithPrime obj = new FibonacciWithPrime();
		obj.fibonacciWithPrime();
	}
}
