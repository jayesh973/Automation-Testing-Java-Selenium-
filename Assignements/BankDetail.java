/* Assignment 5 
create a class called BankDetail, write a method for following operations.
One instance variable which hold current balance.

1. debitAmt(int amount)
2. creditAmt(int amount)
3. printBalance
4. displayCount()

Initally balance is 5000 rs.

Input operations :
debitAmt(500);
debitAmt(1500);
printBalance();
creditAmt(3000);
debitAmt(200);
printBalance();
displayCount();

output :
"Remaining balance is 3000 rs.
Remaining balance is 5800 rs.
debitAmt = 3, creditAmt = 1, printBalance = 2
System.out.println("Remaining balance is " + balance + " rs.");*/
package notepadcodes;

class BankDetail{
	int balance = 5000;
	int dCount;
	int cCount;
	int pCount;
	
	void debitAmt(int debitAmount){		
		balance = balance - debitAmount;
		dCount++;
	}
	
	void creditAmt(int creditAmount){
		balance = balance + creditAmount;
		cCount++;
	}
	
	void printBalance(){
		System.out.println("Remaining balance is " + balance + " rs.");
		pCount++;
	}
	
	void displayCount(){
		System.out.println("debitAmt = " + dCount + ", creditAmt = " + cCount + ", printBalance = " + pCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		
		bankDetail.debitAmt(500);
		bankDetail.debitAmt(1500);
		bankDetail.printBalance();
		bankDetail.creditAmt(3000);
		bankDetail.debitAmt(200);
		bankDetail.printBalance();
		bankDetail.displayCount();		
	}
}