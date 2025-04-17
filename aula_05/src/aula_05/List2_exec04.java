package aula_05;

public class List2_exec04 {

	public static void main(String[] args) {
		// 04) Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. 
		//As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz serão as notas de um participante. 
		//Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.
		
		double notasBimestrais[][] = {
				{4.0, 5.0, 7.0, 3.0},
				{2.5, 6.5, 4.7, 8.0},
				{10.0, 8.5, 9.5, 8.0},
		};
		
		double mediaNotas[] = new double[notasBimestrais.length];
		int i = 0;
		
		System.out.println(notasBimestrais.length);
		
		for(int linha=0; linha < notasBimestrais.length; linha++) {
			int sumNotas = 0;
			float media = 0;
			for(int coluna=0; coluna < 4; coluna++) {
				sumNotas += notasBimestrais[linha][coluna];
			}
			
			media = sumNotas / 4;
			
			mediaNotas[i] = media;
			i++;
		}
		
		for(int j=0; j < mediaNotas.length; j++) {
			System.out.println(mediaNotas[j]);
		}

	}

}
