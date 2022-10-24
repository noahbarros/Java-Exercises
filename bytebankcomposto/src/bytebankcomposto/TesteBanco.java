package bytebankcomposto;

public class TesteBanco {
	public static void main(String[] args) {
		Cliente noah = new Cliente();
		noah.nome = "Noah Barros da Silva";
		noah.cpf = "222.222.222-22";
		noah.profissao = "Engenheiro";
		
		Conta contaDoNoah = new Conta();
		contaDoNoah.deposita(100);
		
		contaDoNoah.titular = noah;
		System.out.println(contaDoNoah.titular.nome);
	}
}
