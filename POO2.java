import javax.swing.JOptionPane;
public class Poo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      String nome = JOptionPane.showInputDialog("Digite seu nome");
//      JOptionPane.showMessageDialog(null, "Bem Vindo" + nome);//JOptionPane é usado para mostrar aquele pop-up do C, mas mais sofisticado
		
//		String entrada1 = JOptionPane.showInputDialog("Numero 1:");
//		String entrada2 = JOptionPane.showInputDialog("Numero 2:");
		
//		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1:"));//conversao de tipo
//		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2:"));
		//double num2 = Integer.parseDouble(entrada2);
		
//		int soma = num1 + num2;
//		JOptionPane.showMessageDialog(null, soma);
		
		//Laços de Repetição
		//Exemplo If e Else
//		if (soma > 0) {
//			System.out.println("Numero Positivo");
//			JOptionPane.showInternalMessageDialog(null, "Numero Positivo");
//		}else {
//			JOptionPane.showInternalMessageDialog(null, "Numero Negativo");
		}//Laços de reptição em java sao mais flexiveis que no C, podendo colocar varios if dentre de else's
	
	//Exemplo For
//	for (int i=0, i<10; i+) { //Uso do for para saber ate quando vai a repetição
//		System.out.println("Numero: "+ i);
	
	//Exemplo While
//	int total = 0;
//	int contador = 1;
	
//	while(contador <=4) {
//		System.out.println("Nota: ");
//		int nota = input.nextInt();
//		total = total + nota;
//		contador = contador + 1;
//	}
//	double media = total / 4;
//	System.out.println("media: "+ media);
//Exemplo Do While
	int numero;
	do {
		System.out.println("Numero: ");
		numero = Input.nextInt();
		System.out.println("Numero: " + numero);
	}while (numero !=0);
	
	
	
	
	input.close();
}
}

//Scanner sc = new Scanner(System.in);

		//System.out.println("Numero: ");
		//double num = sc.nextDouble();
		
		//sc.nextLine();//usa para criar uma nova linha de leitura
		
		//System.out.println("Nome: ");
		//String nome = sc.nextLine();//le todo o conteudo da string incluindo o espaço semelhante ao fgets e ao getchar
		
		//%s(string),%d(inteiro),%f(float e double) tem o mesmo uso no C
		//System.out.printf("%s\n",nome);
		//System.out.printf("%.2f\n",num);
		//System.out.println("Nome digitado: %s" + nome); //forma de impressao do java
		//System.out.println("Numero digitado: %.2f" + num);
		
//		sc.close();