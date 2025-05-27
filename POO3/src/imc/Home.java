package imc;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Criar objeto
		IMC calcIMC = new IMC();
		
		System.out.println("Peso: ");
		calcIMC.peso = sc.nextDouble();
		System.out.println("Altura: ");
		calcIMC.altura = sc.nextDouble();
		
		double imc = calcIMC.calcularIMC();
				
		String resultadoTex = calcIMC.interpretarIMC(imc);		
		
		System.out.println("Seu IMC: " + imc);
		System.out.println("Classificação: " + resultadoTex);
		//System.out.println("Resultado: "+ calcIMC.calcularIMC());
		
		sc.close();

	}

}
