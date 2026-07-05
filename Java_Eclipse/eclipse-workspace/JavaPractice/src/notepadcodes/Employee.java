// Empployee has name, age, department name and it should be printable.

class Employee{
	String employeeName = "Jayesh";
	int age = 30;
	String departmentName = "IT";
	
	void displayEmployeeDetails(){
		System.out.println(employeeName);
		System.out.println(age);
		System.out.println(departmentName);
	}
	
	public static void main(String[] args){
		Employee e = new Employee();
		e.displayEmployeeDetails();		
	}		
}