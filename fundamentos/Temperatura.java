package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		final double ajuste = 32;
		final double multiplicador = 5/9.0;
		
		double F = 86;
		double C = (F - ajuste) * multiplicador;
		System.out.println("O resultado � " + C + "�C."); //para mover a linha alt + seta pra cima ou pra baixo
		
		F = 150;
		C = (F - ajuste) * multiplicador;
		System.out.println("O resultado � " + C + "�C.");
	}

}
