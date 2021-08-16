package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom"); //usar apenas o print sem o ln faz continuar na mesma linha, com o println cria uma nova linha
		System.out.print(" dia\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f\n", 1234.5678);
		System.out.printf("Nome: %s\n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		String sobrenome = entrada.nextLine();
		
		System.out.println("Nome = " + nome);
		System.out.println("Sobrenome = " + sobrenome);
		
		entrada.close();
		
	}

}
