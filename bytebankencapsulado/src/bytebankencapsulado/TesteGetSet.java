package bytebankencapsulado;

public class TesteGetSet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,24226);
		//conta.numero = 1337;
		conta.setNumero(1377);
		System.out.println(conta.getNumero());
		
		Cliente noah = new Cliente();
		//conta.titular = noah;
		noah.setNome("Noah Barros da Silva");
		conta.setTitular(noah);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Engenheiro");
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
