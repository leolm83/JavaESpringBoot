package fundamentos_java;

import java.lang.Math;

public class Exercicio003 {
	final static double PI = 3.14;
	public static double areaCirculo(double raio) {
		double area= Math.pow(raio,2)*PI;
		return area;
	};
	
	
	public static double areaQuadrilatero(double base,double altura) {
		return base*altura;
	}
	
	public static void main(String[] args) {
		System.out.println(areaCirculo(3.4));
		System.out.println(areaQuadrilatero(3, 4));
	}
}
