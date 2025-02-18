import java.util.Scanner;

	public class nota {

		public static void main(String args[]) {

			
			Scanner sc = new Scanner(System.in);

			double primeiraNota; 
			double segundaNota;
			double terceiraNota;

			System.out.println("Digite a primeira nota:");
			primeiraNota = sc.nextDouble();

			System.out.println("Digite a segunda nota:");
			segundaNota = sc.nextDouble();

			System.out.println("Digite a terceira nota:");
			terceiraNota = sc.nextDouble();

			double resultadoNota = (primeiraNota + segundaNota + terceiraNota) / 3;
			
			System.out.println("\nResultados:\n");
			System.out.println(resultadoNota);
			
		}
	}