package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //conversao implicita
		System.out.println(a);
		
		float b = (float) 1.2345; //conversao explicita - colocar o nome do tipo primitivo que desejo converter [cast]
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; // conversao explicita [cast]
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		
 		
	}

}
