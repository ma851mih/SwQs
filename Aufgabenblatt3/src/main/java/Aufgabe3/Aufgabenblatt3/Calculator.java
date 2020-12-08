package Aufgabe3.Aufgabenblatt3;

	public class Calculator implements ICalculator {

		public Integer addition(int number1, int number2) {	
			return (number1 + number2);
		}

		public Integer subtraction(int number1, int number2) {
			return (number1 - number2);
		}

		public Integer multiplication(int number1, int number2) {
			return (number1 * number2);
		}

		public Integer division(int number1, int number2) {
			return (number1 / number2);
		}

}
