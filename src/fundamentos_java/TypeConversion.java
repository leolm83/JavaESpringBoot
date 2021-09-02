package fundamentos_java;

public class TypeConversion {
	public static void main(String[] args) {
		double num = 1;//conversao implicita de inteiro para double
		System.out.println(num);
		double myDouble = 1.234434343434345;//numeros com casas decimais por padrao no java sao double
		float myFloat = (float)1.2343434342342333434;// conversao explicita para float
		float otherFloat = 1.2322432232323F;//inserir um F ao final do numero o converte para float tambem!
		System.out.printf("%f    %f    %f \n",myDouble,myFloat,otherFloat);
		System.out.println("Ainda nao ficou explicito para mim o por que com format strings o double perde algumas casas"+myDouble);
	}
}
