package Desafio_DIO_banco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new contaCorrente();
		Conta poupanca = new contaPoupanca();
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
				
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
