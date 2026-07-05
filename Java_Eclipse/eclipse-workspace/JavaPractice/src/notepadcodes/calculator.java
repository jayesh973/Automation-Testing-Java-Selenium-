class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	void add(){
		int ans = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + ans);
	}
	
	void sub(){
		int ans = num1 - num2;
		System.out.println("Sub of " + num1 + " and " + num2 + " is " + ans);
	}
	
	void mul(){
		int ans = num1 * num2;
		System.out.println("Mul of " + num1 + " and " + num2 + " is " + ans);
	}
	
	void div(){
		int ans = num1 / num2;
		System.out.println("Div of " + num1 + " and " + num2 + " is " + ans);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}