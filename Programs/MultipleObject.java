class MultipleObject{
	int x = 10;
	int y = 20;
	
	void updateData(){
		int x = 30;
		int y = 40;
		
		y = x+y;
		x = this.x + y;
		
		MultipleObject multipleObject = new MultipleObject();
		multipleObject.display();
		System.out.println(multipleObject.x + ":" + multipleObject.y + ":" + x + y);
	}
	
	void display(){
		System.out.println(x + y);
	}
	
	public static void main(String[] args){
		MultipleObject multipleObject = new MultipleObject();
		
		multipleObject.updateData();
	}

}