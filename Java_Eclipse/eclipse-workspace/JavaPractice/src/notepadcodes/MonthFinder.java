/* Assignment 9
Find out month and print relavent information based in monthIndex.
Index - 1 represents January, index - 2 represents - Feb , .... index - 12 represents December

input : 2
output : This month belongs to Q1.
its a feb, best possible last month to visit Goa.

input : 12
output : This month belongs to Q4
Favourite month for winter lover, wonderful time for vacation.

input : -4
Invalid input, monthIndex should be bewteen 1 to 12*/
class MonthFinder{
	void displayMonth(int monthIndex){
		if(monthIndex >= 1 && monthIndex <= 3){
			System.out.println("This month belongs to Q1.");
			if(monthIndex == 1){
				System.out.println("It's January");
			}else if(monthIndex == 2){
				System.out.println("It's February");
			}else if(monthIndex == 3){
				System.out.println("It's March");
			}
		}else if(monthIndex >= 4 && monthIndex <= 6){
			System.out.println("This month belongs to Q2.");
			if(monthIndex == 4){
				System.out.println("It's April");
			}else if(monthIndex == 5){
				System.out.println("It's May");
			}else if(monthIndex == 6){
				System.out.println("It's June");
			}
		}else if(monthIndex >= 7 && monthIndex <= 9){
			System.out.println("This month belongs to Q3.");
			if(monthIndex == 7){
				System.out.println("It's July");
			}else if(monthIndex == 8){
				System.out.println("It's August");
			}else if(monthIndex == 9){
				System.out.println("It's September");
			}
		}else if(monthIndex >= 10 && monthIndex <= 12){
			System.out.println("This month belongs to Q4.");
			if(monthIndex == 10){
				System.out.println("It's October");
			}else if(monthIndex == 11){
				System.out.println("It's November");
			}else if(monthIndex == 12){
				System.out.println("It's December");
			}
		}else{
			System.out.println("Invalid input, monthIndex should be bewteen 1 to 12.");
		}
	}

	public static void main(String[] args){
		MonthFinder monthFinder = new MonthFinder();
		
		monthFinder.displayMonth(2);
		monthFinder.displayMonth(12);
		monthFinder.displayMonth(-4);
	}
}