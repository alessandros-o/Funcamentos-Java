package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recupera��o.";
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		
		String temDesconto = nota >= 7.0 && bomComportamento ? "Sim." : "N�o.";
		
		System.out.println("Tem desconto? " + temDesconto);
	}

}
