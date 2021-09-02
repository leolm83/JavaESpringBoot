package exercicios;

import java.util.Scanner;

/**
 * <h1>Exercicio 01 - Estruturas de Controle</h1>
 *
 * <p>
 * 1-Criar um programa que receba um numero e verifique se ele é primo
 * </p>
 * 
 * @author Leonardo Marques
 * @version 1.0
 * @since 2021-08-30
 *
 */

public class Ex003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um valor inteiro e positivo: ");
		int num = sc.nextInt();
		sc.close();
		if (num >= 1) {
			int divisores = 0;
			for (int divisor = 1; divisor <= num; divisor++) {
				if (num % divisor == 0) {
					divisores += 1;
					System.out.printf("O valor %d é divisivel por %d \n", num, divisor);
				}
			}
			if (divisores <= 2) {
				System.out.printf("O Numero %d é primo", num);
			} else {
				System.out.printf("O Numero %d nao é primo", num);
			}
		}
		else {
			System.out.println("Voce digitou um valor inválido");
		}
	}
}
