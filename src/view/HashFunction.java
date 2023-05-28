package view;

	public class HashFunction {
	    public static void main(String[] args) {
	        String[] vetor = new String[100]; // Vetor com 100 posições

	        // Exemplo de números de telefone
	        String numero1 = "11987654321";
	        String numero2 = "21876543210";
	        String numero3 = "31912345678";

	        // Chama a função hash para inserir os números de telefone no vetor
	        inserirNumero(numero1, vetor);
	        inserirNumero(numero2, vetor);
	        inserirNumero(numero3, vetor);

	        // Exibe o conteúdo do vetor
	        for (int i = 11; i <= 99; i++) {
	            if (vetor[i] != null) {
	                System.out.println("Endereço " + i + ": " + vetor[i]);
	            }
	        }
	    }

	    public static void inserirNumero(String numero, String[] vetor) {
	        int endereco = funcaoHash(numero);

	        // Verifica se o endereço já está ocupado, caso positivo encontra o próximo endereço disponível
	        while (vetor[endereco] != null) {
	            endereco++;
	            if (endereco > 99) {
	                endereco = 11; // Volta ao início do vetor
	            }
	        }

	        vetor[endereco] = numero; // Insere o número de telefone no vetor
	    }

	    public static int funcaoHash(String numero) {
	        int ddd = Integer.parseInt(numero.substring(0, 2));
	        int hash = ddd + 11; // Adiciona 11 para começar no endereço 11
	        return hash;
	    }
	}


