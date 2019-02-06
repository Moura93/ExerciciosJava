
/*
 *Ex12
 *2) Escreva um algoritmo que calcule a soma dos números de 1 a 15.
*/
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantNum = 0;                                      //Amount of numbers to sum = 0
        int num1 = 0;
        int num2 = 0;
        //while to ensure that the number of variables will be 2
        while (quantNum < 2) {
            
            if (quantNum == 0) {
                System.out.println("Digite um numero entre 1 e 15: ");
                num1 = input.nextInt();                            //input the first number
            }

            if (num1 <= 15 && num1 >= 1 && quantNum == 0) {    //if the number is less or equal 15 and bigger or equal 1
                quantNum++;   
                System.out.println("Digite outro numero entre 1 e 15: ");
                num2 = input.nextInt(); 
                if (num2 <= 15 && num2 >= 1 && quantNum == 1) {
                    quantNum++;   
                }
                else{
                    System.out.println("Numero Invalido");
                }                       //input the first number                                 //increment +1 to quantNum
            }
            else if (quantNum == 1){
                System.out.println("Digite outro numero entre 1 e 15: ");
                num2 = input.nextInt(); 
                if (num2 <= 15 && num2 >= 1 && quantNum == 1) {
                    quantNum++;   
                }
                else{
                    System.out.println("Numero Invalido");
                }
            }
            else{
                System.out.println("Numero Invalido");
            }
        }    
        int soma = num1 + num2;
        System.out.println("A soma e: " + soma);   
    }
}