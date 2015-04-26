import java.util.Scanner;

public class Test {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		//Create a object of MyStack
		MyStack myStack1 = new MyStack();
		//User enters three strings and invokes method
		for(int i=0 ; i<3 ; i++){
			System.out.print("Please enter " + (i+1) + " string: ");
			myStack1.push(input.next());
		}
		
		System.out.println();
		//Create a object of MyStack
		MyStack myStack2 = (MyStack)(myStack1.clone());
		//User enters three strings and invokes method
		for(int i=0 ; i<3 ; i++){
			System.out.print("Please reenter " + (i+1) + " string: ");
			myStack2.push(input.next());
		}
		
	}
}
