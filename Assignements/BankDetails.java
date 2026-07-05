/* Assignment 6
Create a class called BankDetails.
If debit operation perform successfully, then print "Debit operation for amount 100 rs successfully."
otherwise print, "InSufficient balance, user requested 100 rs, current balance 50 rs.";
if user could debit successfully then only consider it in debitCount.
If credit amt is more than 5000 rs, tell user "Maximum credit amount should be equal or less than 5000.".
if credit amt is less or equal 5000 rs, then show success message "2000 rs successfully credited". in that case increment creditCount value.

diplay method should print, how many times debit and credit operation performed and current balance.

NOTE : initial balance is 3000.
input :
debitAmt(2000);
debitAmt(1500);
creditAmt(6000);
creditAmt(4500);
debitAmt(1000);
display();

output :
Debit operation for amount 2000 rs successfully.
InSufficient balance, user requested 1500 rs, current balance 1000 rs.
Maximum credit amount should be equal or less than 5000.
4500 rs successfully credited.
Debit operation for amount 1000 rs successfully.
debit Operation = 2, credit Operation = 1, current balance = 4500.
*/

class BankDetails{
	int balance = 3000;
	int dCount;
	int cCount;
	int pCount;
	int maxCreditLimit = 5000;
	
	void debitAmt(int debitAmount){				
		if(debitAmount <= balance){
			dCount++;
			balance = balance - debitAmount;
			System.out.println("Debit operation for amount " + debitAmount +" rs successfully.");
		}else{
			System.out.println("InSufficient balance, user requested " + debitAmount + " rs, current balance " + balance + " rs.");
		} 		
	}
	
	void creditAmt(int creditAmount){
		if(creditAmount <= maxCreditLimit){
			balance = balance + creditAmount;
			cCount++;
			System.out.println(creditAmount + " rs successfully credited.");
		}else{
			System.out.println("Maximum credit amount should be equal or less than " + maxCreditLimit + ".");
		}
	}
	
	void printBalance(){
		System.out.println("Remaining balance is " + balance + " rs.");
		pCount++;
	}
	
	void display(){
		System.out.println("debit Operation = " + dCount + ", credit Operation = " + cCount + ", current balance = " + balance + ".");
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		
		bankDetails.debitAmt(2000);
		bankDetails.debitAmt(1500);
		bankDetails.creditAmt(6000);
		bankDetails.creditAmt(4500);
		bankDetails.debitAmt(1000);
		bankDetails.display();		
	}
}