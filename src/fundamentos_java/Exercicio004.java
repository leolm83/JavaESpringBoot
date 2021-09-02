package fundamentos_java;

public class Exercicio004 {

	public static void main(String[] args) {
		//Metodos da classe String
		String saudacao= "Bom dia X";
		saudacao=saudacao.replace("X","Senhora");
		saudacao=saudacao.toUpperCase();
		saudacao=saudacao.concat("!!!");
		/*nenhum desses metodos altera a string original, 
		por isso é preciso reatribuir o valor à variavel "saudacao"
		*/
		//é possivel encadear todas as chamadas assim:
		String outraSaudacao="Bom dia X".replace("X","Senhora").toUpperCase().concat("!!!");
		System.out.println("Usndo em varias chamadas "+saudacao);
		System.out.println("Usando na mesma linha "+outraSaudacao);
	}

}
