/*Assignment - 12 : 31st March'2026
Print all the numbers divisible by 3 and 7 from user defined range.

input  : 1 , 100
output : 21
         42
         63
         84

input  : 10,50
output : 21
         42*/
		 
class NumDivByThreeAndSeven{
	void isDivisible(int startR, int endR){		
		for(int num = startR; num <= endR; num++){
			if(num%3 == 0 && num%7 == 0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		NumDivByThreeAndSeven numDivByThreeAndSeven = new NumDivByThreeAndSeven();
		
		numDivByThreeAndSeven.isDivisible(1, 100);
		System.out.println("-----");
		numDivByThreeAndSeven.isDivisible(10, 50);
	}
}