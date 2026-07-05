class CalculatorMethodWithParam{
	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + ans);
	}
	
	void sub(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Sub of " + num1 + " and " + num2 + " is " + ans);
	}
	void mul(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("Mul of " + num1 + " and " + num2 + " is " + ans);
	}
	
	void div(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Div of " + num1 + " and " + num2 + " is " + ans);
	}
	
	public static void main(String[] args){
		CalculatorMethodWithParam calculatorMethodWithParam = new CalculatorMethodWithParam();
		
		calculatorMethodWithParam.add(200,100);
		calculatorMethodWithParam.sub(200,100);
		calculatorMethodWithParam.mul(200,100);
		calculatorMethodWithParam.div(200,100);
	}
}
