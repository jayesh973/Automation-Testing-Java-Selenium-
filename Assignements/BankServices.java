class BankServices{
	int balance = 5000;
	
	void debitAmt(int debitAmount){
		balance = balance - debitAmount;
	}
	
	void creditAmt(int creditAmount){
		balance = balance + creditAmount;
	}
	
	void printBalance(){
		System.out.println("Available Balance is " + balance);
	}
	
	public static void main(String[] args){
		BankServices bankServices = new BankServices();
		
		bankServices.debitAmt(500);
		bankServices.debitAmt(1500);
		bankServices.printBalance();
		bankServices.creditAmt(3000);
		bankServices.debitAmt(200);
		bankServices.printBalance();
	}
}