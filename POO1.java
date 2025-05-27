package br.ucb.poo;
import java.util.Scanner; //import é usando como o include, é o chamado das bibliotecas
public class Helloworld {

	public static void main(String[] args) {
	//Inicio de leitura de dados do teclado	
    Scanner sc = new Scanner(System.in);
    //terminando processo de leitura do teclado
    sc.close(); //idealmente usando no final do codigo
		
	System.out.println("Ola Mundo");//impressao usando system.ou.print
	
	String nome = "Alguem"; //string se torna variavel diferente do C
	int num1 = 2; //int numero como no C
	double num2 = 10.3; //utilização maior do double
	float num3 = 10.2f; // necessario colocar f no final de um numero em float
	char letra = 'A'; //uso das aspas simples ao inves das duplas, ou vai reconhecer como string
	boolean booleano = true;
    boolean booleano1 = false;
	
	//impressao com variavel
	System.out.printf("Nome: " + nome);
    
    //mais uma leitura de dados:
    System.out.println("Informe uma palavra: ");
	String palavra = sc.next();
	
	System.out.println("Informe um numero: ");
	int numero = sc.nextInt();
	
	System.out.println("Informe um segundo numero");
	double numero2 = sc.nextDouble();
	
	System.out.println("Infomer um caracter: ");
	char caracter = sc.next().charAt(0); //usando esse comando é necessario informar a posição q deve ser lida
	
	System.out.println(caracter);
	System.out.println(numero2);
	System.out.println(numero);
	System.out.println(palavra);
	
	//leitura de varios dados de uma mesma linha
	String s1, s2, s3;
	System.out.println("Informe os dados: ");
	s1 = sc.nextLine();
	s2 = sc.nextLine();
	s3 = sc.nextLine();
	
	System.out.println("Dados digitados: ");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	sc.close();
	}

}
