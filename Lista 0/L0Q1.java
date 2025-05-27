import java.util.Scanner;
public class L0Q1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valores = new double[5];
        double soma = 0;

        System.out.println("Digite 5 valores: ");
        for (int i = 0; i < valores.length; i++){
            System.out.print("Valor " + (i+1) + ": ");
            valores[i] = sc.nextDouble();
            soma += valores[i];
        }
        double media = soma / valores.length;
        System.out.println("Valores digitados: ");
        for (int i = 0; i < valores.length; i++){
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
        }
        System.out.println("Media aritmedica: " + media);
        sc.close();
    }
}
