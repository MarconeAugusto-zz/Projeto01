import java.util.Scanner;
public class Conversor{

	public static void ola(String nome){
		System.out.println("Bom dia " +nome);
	}


	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		System.out.println("Digite o valor em Km que deseja converter: ");
		
		System.out.println("Ola mundo");
		ola("Maria");
	}
	
	public static double KmMilha(double Km){

		System.out.println("O valor em milhas é: ");
	
		return Km * 1.60934;
	}
}



	
