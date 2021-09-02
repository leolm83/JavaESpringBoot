package exercicios;
/**
* <h1>Exercicio 01 - Estruturas de Controle</h1>
*
* <p>1-Criar um programa que receba um numero e  verifique se
*  ele está entre 0 e 10 e é par
* </p>
* 
* @author  Leonardo Marques 
* @version 1.0
* @since   2021-08-30
*
*/
import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro :");
		int userInput=sc.nextInt();
		sc.close();
		if(userInput>-1 && userInput<11) {
			System.out.printf("%d esta entre 0 e 10 \n",userInput);
		}
		else {
			System.out.printf("%d nao está entre 0 e 10 \n",userInput);
		}
		if(userInput/2==0){
			System.out.println("E é Par");
		}
		else {
			System.out.println("E é Impar");
		}
	}
}
