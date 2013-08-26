package prova;

/**
 * @author Fábio Sales
 * @author Osmar Oliveira
 * @author Márcio David
 * @author Victor
 */

public class Gerador {

	// método main para iniciar o programa
	public static void main(String[] args) {

		// Instancia a class Intereção, responsável por mostrar o diálogo com o
		// usuário.
		Interacao inicio = new Interacao();

		// chamamos o método iniciar, onde o usuáro escolherá o que deseja
		// fazer.
		inicio.iniciar();

	}

}
