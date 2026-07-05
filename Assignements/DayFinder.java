/* Asssignment 8
Find out day and print relavent information based in dayIndex.
Index - 1 represents monday, index - 2 represents - tuesday , .... index - 7 represents sunday

input : 2
output : weekday
its a tuesday and second productive day of the week.

input : 7
weekend
its a sunday and its time to prepare mind for next week productive day.

input : 11
Invalid input, dayIndex should be bewteen 1 to 7.
*/

class DayFinder{
	void displayDay(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("It's a Week Day");
			if(dayIndex == 1){
				System.out.println("It's Monday");
			}else if(dayIndex == 2){
				System.out.println("It's Tuesday");
			}else if(dayIndex == 3){
				System.out.println("It's Wednesday");
			}else if(dayIndex == 4){
				System.out.println("It's Thursday");
			}else if(dayIndex == 5){
				System.out.println("It's Friday");
			}
		}else if(dayIndex == 6 || dayIndex == 7){
			System.out.println("It's a Weekend");
			if(dayIndex == 6){
				System.out.println("It's Saturday");
			}else if(dayIndex == 7){
				System.out.println("It's Sunday");
			}
		}else{
			System.out.println("Invalid Input, dayIndex should be between  1 to 7.");
		}
	}

	public static void main(String[] args){
		DayFinder dayFinder = new DayFinder();
		
		dayFinder.displayDay(1);
		dayFinder.displayDay(2);
		dayFinder.displayDay(3);
		dayFinder.displayDay(4);
		dayFinder.displayDay(5);
		dayFinder.displayDay(6);
		dayFinder.displayDay(7);
		dayFinder.displayDay(8);
	}
}