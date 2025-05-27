package m2;
import m1.carro;

public class Principal_m2 {
	public static void main (String args[]) {
	carro carro1 = new carro("Fusca", 50000, 1000);
	carro1.exibirModelo();
	carro1.exibirPreco();
	
	String modelo = "Gol";
	double preco = 25000;
	double km = 1000;
	carro carro2 = new carro(modelo, preco, km);
	
	//carro2.quilometragem = 1400;
	//carro2.preco = 20000;
	carro2.exibirPreco();

}
}
