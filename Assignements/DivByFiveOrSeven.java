/* Assignment - 10 : 31st March'2026
Print whether given number number is div by 5 or 7.

input : 40
output : 40 is divisible by 5

input : 49
output : 49 is divisible by 7

input : 35
output : 35 is divisible by 5 and 7.*/

class DivByFiveOrSeven{
	void isDivisible(int num){
		if(num%5 == 0 || num%7 == 0){
			if(num%5 == 0 && num%7 == 0){
				System.out.println(num + " is divisible by 5 and 7");
			}else if(num%5 == 0){
				System.out.println(num + " is divisible by 5");
			}else{
				System.out.println(num + " is divisible by 7");
			}
		}
	}
	
	public static void main(String[] args){
		DivByFiveOrSeven divByFiveOrSeven = new DivByFiveOrSeven();
		
		divByFiveOrSeven.isDivisible(40);
		divByFiveOrSeven.isDivisible(49);
		divByFiveOrSeven.isDivisible(35);
	}
}