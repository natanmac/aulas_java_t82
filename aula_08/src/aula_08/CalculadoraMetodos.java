package aula_08;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = leia.nextDouble();
		
		var resSoma = somar(num1, num2);
		var resSubtrair = subtrair(num1, num2);
		var resMultiplicar = multiplicar(num1, num2);
		var resDividir = dividir(num1, num2);
		
		sobre();
		System.out.println("A soma dos valores: " + resSoma);
		System.out.println("A subtração dos valores: " + resSubtrair);
		System.out.println("A multiplicação dos valores: " + resMultiplicar);
		System.out.println("A divisão dos valores: " + resDividir);
		
		leia.close();

	}
	
	static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	
	static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}
	
	static double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	static void sobre() {
		System.out.println("Calculadora com métodos");
		System.out.println("Feita por: Natan");
	}

}
