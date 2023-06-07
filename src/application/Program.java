package application;

import entitie.Conta;
import entitie.ContaEmpresa;
import entitie.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1001, "fabricio", 0.0);
		ContaEmpresa contaEmpresa = new ContaEmpresa(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Conta cont1 = contaEmpresa;
		Conta cont2 = new ContaEmpresa(1003, "Bob", 0.0, 200.0);
		Conta cont3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		ContaEmpresa cont4 = (ContaEmpresa) cont2;
		cont4.limite(100.0);

		//ContaEmpresa cont5 = (ContaEmpresa)cont3;
		if(cont3 instanceof ContaEmpresa) {
			ContaEmpresa cont5 = (ContaEmpresa) cont3;
			cont5.limite(200.0);
			System.out.println("Emprestimo!");
		}
		if(cont3 instanceof ContaPoupanca) {
			ContaPoupanca cont5 = (ContaPoupanca) cont3;
			cont5.atualizacaoSaldo();
			System.out.println("Atualização!");
		}
	}

}
