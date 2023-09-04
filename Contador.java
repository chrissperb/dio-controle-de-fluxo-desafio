/*Este códio faz parte de um exercicio de uso de alteradores de fluxo.
Primeiro o codigo pede dois numeros.
O primeiro numero deve ser menor do que o segundo. Caso isso nao ocorra ele lanca uma mensagem de erro.
Em seguida, o programa itera, contando a diferenca entre os valores digitados.
 */

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close(); //Fecha o scanner terminal

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		} else if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número: " + i);
			}
		}
	}
}