package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class QuadradoCubo {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite o Valor:");
		
		double x = Double.parseDouble(valor);
		System.out.println("O Valor elevado ao quadrado é: " + Math.pow(x, 2));
		System.out.println("O Valor elevado ao cubo é: " + Math.pow(x, 3));
	}

}
