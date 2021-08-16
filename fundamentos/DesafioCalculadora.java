package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		String numero1 = entrada.next();
		
		System.out.println("Digite a operação:");
		String operacao = entrada.next();
		
		System.out.println("Digite o segundo número:");
		String numero2 = entrada.next();
		
				
		double num1 = Double.parseDouble(numero1);
		double num2 = Double.parseDouble(numero2);
		double a = num1 + num2;
		double b = num1 - num2;
		double c = num1 * num2;
		double d = num1 / num2;
		
		String result1 = Double.toString(a);
		String result2 = Double.toString(b);
		String result3 = Double.toString(c);
		String result4 = Double.toString(d);
		
		
		String resultFinal = "+".equals(operacao) ? result1 : "-".equals(operacao) ? result2 : "*".equals(operacao) ? result3 : result4;
		
		System.out.println(resultFinal);
		
		entrada.close();
	}

}
