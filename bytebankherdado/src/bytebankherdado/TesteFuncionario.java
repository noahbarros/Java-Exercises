package bytebankherdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario noah = new Funcionario();
		noah.setNome("Noah Barros da Silva");
		noah.setCpf("223355646-9");
		noah.setSalario(2600.00);
		
		System.out.println(noah.getNome());
		System.out.println(noah.getBonificacao());
		
		
	}
}
