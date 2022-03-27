package Desafio_DIO_banco;

public class contaCorrente extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		
	}

}
