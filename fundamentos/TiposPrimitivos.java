package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipo numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //usar a letra L maiúsculo para informar que esse número é um literal LONG
		
		// Tipos numéricos reais
		float salario = 11_445.44F; // usar a letra F em maiúsculo para informar ao JAVA que esse número é do tipo float senão ele vai entender como se fosse double
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipo caractere
		char status = 'A'; // Ativo - esse tipo só permite 1 caractere
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numeros de Viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}

}
