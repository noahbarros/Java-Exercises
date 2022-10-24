package bytebank;

public class TesteMetodo {

	public static void main(String[] args) {
		Conta contaDoNoah = new Conta();
		contaDoNoah.saldo = 100;
		contaDoNoah.deposita(50);
		System.out.println(contaDoNoah.saldo);
		contaDoNoah.saca(20);
		System.out.println(contaDoNoah.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		System.out.println(contaDaMarcela.saldo);
		contaDaMarcela.transfere(300, contaDoNoah);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoNoah.saldo);
		
		contaDoNoah.titular = "Noah Barros";
		System.out.println(contaDoNoah.titular);
		
		
	}

}
