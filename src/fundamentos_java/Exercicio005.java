package fundamentos_java;

public class Exercicio005 {
	public static void main(String[] args) {
		String minhaSaudacao= "Boa Tarde";
		System.out.println("Metodos em Strings :");
		System.out.println("Sem modificacao : "+minhaSaudacao);
		System.out.println("Concatenacao usando o Método .concat('!!!') : "+minhaSaudacao.concat("!!!")+"\n");
		System.out.println("Concatenacao usando o '+' : "+minhaSaudacao+"!!!"+"\n");
		System.out.println("Usando .startsWith('B')"+minhaSaudacao.startsWith("Boa")+" \nEste método retorna true "
				+ "\nse cada caractere realmente for igual, entao provavelmente "
				+ "\nseja interessante usar em conjunto .toUpperCase() "
				+ "\nou .toLowerCase() "+"\n");
		System.out.println("Usando .endsWith('Tarde') em conjunto com toUpperCase() : "+minhaSaudacao.toUpperCase().endsWith("TARDE")+"\n");
		System.out.println("endsWith e startsWith possuem sobrecarga e "
				+ "\npode-se passar o indice que vc deseja comecar a verificacao "
				+ "\nexemplo 'Leonardo'.startsWith('ona',2) : "+"Leonardo".startsWith("ona",2)+"\n");
		System.out.println("Obtendo o Tamanho da String : variavel.length() ou 'minhastring'.length() : "+"minhastring".length()+"\n");
		System.out.println("Verificando se uma string é igual a outra com .equals() : "+minhaSaudacao.equals("boa tarde")+" compara todos os caracteres considerando maiusculas e minusculas !!");
		System.out.println("Para nao ser Case Sensitive basta usar 'LEO'.equalsIgnoreCase('leo') "+"LEO".equalsIgnoreCase("leo"));
		
	}
}
