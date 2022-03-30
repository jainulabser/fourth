
public class Fourth {
	private int output = 27;
	private int first = 9;
	private int second = 5;
	private int third = 6;
	private int fourth = 7;

	private void gameplay() {
		char expression[] = { '+', '-', '*', '/', '(', ')' };
		String result = null;
		int resultInt = 0;
		for (int i = 0; i < expression.length; i++) {

			result = first + "" + expression[i] + "" + second + "" + expression[i] + "" + third + expression[i] + ""
					+ fourth;

			switch (expression[i]) {
			case '+':
				resultInt = first + second + third + fourth;
				break;
			case '-':
				resultInt = first - second - third - fourth;
				break;
			case '*':
				resultInt = first * second * third * fourth;
				break;
			case '/':
				resultInt = first / second / third / fourth;
				break;
			}
			if (resultInt == output) {
				System.out.println(result);
				break;
			}
		}
	}

	public static void main(String[] args) {

		Fourth fourthGame = new Fourth();
		fourthGame.gameplay();
	}
}
