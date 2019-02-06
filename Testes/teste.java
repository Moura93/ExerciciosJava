import java.util.Scanner;

/*
Autor: Felipe Moura
Data: 22/01/2019
*/
public class teste {

	public static void main(String[] args) {

			//ENTRADA DE VALORES
		Scanner sc  = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double n2 = sc.nextDouble();
		
			//OPERA��OES
		double s = n1 + n2;
		double m = n1*n2;
		
			//SOMA = MULTIPLICA��O?
		if(s==m) {
			System.out.println("A soma � igual a multiplica��o");
		}
		else {
			System.out.println("A soma � diferente da multiplica��o");
		}
		
			//TELA
		System.out.println("Soma: " + s);	
		System.out.println("Multiplica��o: " + m);

	}

}
