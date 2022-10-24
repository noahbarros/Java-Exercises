package sintaxevariaveisefluxos;

public class TesteEscopo {
	
	public static void main(String[] args) {
			System.out.println("Testando Escopo");
			
			int idade = 16;
			int quantidadePessoas = 3;
			
			boolean acompanhado;
			
			if (quantidadePessoas >= 2) {
				acompanhado = true;
			}
			else {
				acompanhado = false;
			} 
			
			System.out.println("Valor acompanhado: " + acompanhado);
	}
}
