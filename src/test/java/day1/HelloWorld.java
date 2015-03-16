package day1;

public class HelloWorld {
	

	//main method
	public static void main(String[] args) {
		
		System.out.println("Hello World !" );
		
		HelloWorld.substact();
		
		//creating object
		
		HelloWorld hw = new HelloWorld();

		hw.add();
	}
	
	//staic method
	public static void substact(){
		System.out.println("substract two numbers");
	}
	
	//normal method
	public void add(){
		System.out.println("adding two numbers");
	}
	
	//static block
	static {
		System.out.println("Hi");
	}
	
	           
}
