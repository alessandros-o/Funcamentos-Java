package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcionario
		
		// Tipo num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //usar a letra L mai�sculo para informar que esse n�mero � um literal LONG
		
		// Tipos num�ricos reais
		float salario = 11_445.44F; // usar a letra F em mai�sculo para informar ao JAVA que esse n�mero � do tipo float sen�o ele vai entender como se fosse double
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipo caractere
		char status = 'A'; // Ativo - esse tipo s� permite 1 caractere
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numeros de Viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}

}
