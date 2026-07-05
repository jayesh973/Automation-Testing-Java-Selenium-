/*Assignment - 11 : 31st March'2026
Write a method to print 1 to 10 numbers using for loop.
Write a method print all the numbers from user defined range.*/

class PrintNumbersUsingForLoop{
	void printNumber(){
		for(int num = 1; num <= 10; num++){
			System.out.println(num);
		}
	}
	
	void printNumberInRange(int startR, int endR){
		for(int num = startR; num <= endR; num++){
			System.out.println(num);
		}
	}
	
	public static void main(String[] args){
		PrintNumbersUsingForLoop printNumbersUsingForLoop = new PrintNumbersUsingForLoop();
		
		printNumbersUsingForLoop.printNumber();
		System.out.println("--------");
		printNumbersUsingForLoop.printNumberInRange(11,20);
	}
}