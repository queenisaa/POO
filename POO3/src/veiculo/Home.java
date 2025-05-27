package veiculo;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criar objeto
		Carro carro = new Carro();
		Carro carro2 = new Carro();
		
		//instanciar os atributos
		carro.modelo = "SUV";
		carro.cor = "Azul";
		carro.ano = 2023;
		carro.placa = "QCY-012";
		
		carro2.modelo = "HB20";
		carro2.cor = "Prata";
		carro2.ano = 2014;
		carro2.placa = "NFAO-234";
		
		
		carro.exibirInformacoes();
		carro2.exibirInformacoes();

	}

}