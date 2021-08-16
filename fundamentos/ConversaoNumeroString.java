package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // nesse caso foi lancado um tipo primitivo e depois relacionei ao Integer e transformei em string
		
	}

}
