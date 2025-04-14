package aula_02;

import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {
		// 3) Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido.
		// SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS
		
		float salarioBruto, adicionalNoturno, horaExtra, descontos, salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o adicional hora extra: ");
		horaExtra = leia.nextFloat();
		
		System.out.println("Digite o adicional Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * 5) - descontos;
		System.out.println("O salário liquido final: " + salarioLiquido);

	}

}
