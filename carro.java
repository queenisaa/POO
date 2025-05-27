package m1;

public class carro {
	public String modelo;
	
	private double preco;
	
	double quilometragem;

	public carro(String modelo, double preco, double quilometragem) {
		this.modelo = modelo;
		this.preco = preco;
		this.quilometragem = quilometragem;
	}
	public void exibirModelo() {
		System.out.println("Modelo: " + modelo);
	}
	
	public void exibirPreco(){
		System.out.println("Preco: " + preco);
	}
	
	public void exibirKm(){
		System.out.println("KM: " + quilometragem);
	}
	

}
