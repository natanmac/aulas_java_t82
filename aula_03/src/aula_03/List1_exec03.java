package aula_03;

public class List1_exec03 {

	public static void main(String[] args) {
		// 03) Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
		//Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). 
		//De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.
		
		String nome = "Fulaninho da Silva Sauro";
		int idade = 17;
		boolean primeiraDocao = true;
		
		if (idade >= 60 && idade <= 69 && primeiraDocao) {
			System.out.println(nome + " está apto para doar sangue!");
		} else if (idade >= 18 && idade <= 60) {
			System.out.println(nome + " está apto para doar sangue!");
		} else {
			System.out.println(nome + " NÃO está apto para doar sangue!");
		}

	}

}
