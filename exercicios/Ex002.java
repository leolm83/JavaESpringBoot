package exercicios;

import java.util.Scanner;

/**
* <h1>Exercicio 01 - Estruturas de Controle</h1>
*
* <p>3-Criar um programa que receba duas notas parciais e calcule a média final,
* se a media for maior igual a 7.0 imprime aprovado,
* se estiver entre menor que 7.0 e maior que 4.0 imprime recuperacao
* caso contrario imprime reprovado
* </p>
* 
* @author  Leonardo Marques 
* @version 1.0
* @since   2021-08-30
*
*/
public class Ex002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double	firstNum=sc.nextDouble();
		sc.nextLine();
		double secondNum=sc.nextDouble();
		sc.close();
		double average=(firstNum+secondNum)/2.0;
		System.out.printf("A sua média parcial é %f \nE voce esta : ",average);
		if(average>=7.0) {
			System.out.println("Aprovado");
		}
		else if(average>=4.0) {
			System.out.println("Em Recuperacao");
		}
		else {
			System.out.println("Reprovado");
		}
		}
	}

