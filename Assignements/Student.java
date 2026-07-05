Business requirement : Student has name, role number and it should be printable.

Class : Student -> as the requirement is related to student)
Variable : name, rno -> name, role  number
Method : display() -> print logic
Execution : Main Method

class Student{
	String name = "Technocredits";
	int rno = 1;
	
	void display(){
		System.out.print(name); // Technocredits
		System.out.println(rno);  // 1
	}
	
	public static void main(String[] args){
		Student s = new Student();
		s.display();
		System.out.println(s); // Student@372f7a8d (Prints memory address as it is memory address)
	}		
}

/*
Output:

Technocredits1
Student@372f7a8d
*/