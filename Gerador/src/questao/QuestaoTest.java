package questao;

/**
 * @author Fabio sales
 * @author Osmar Oliveira
 * @author Márcio David
 *@author Victor
 */
import java.io.IOException;

import junit.framework.TestCase;

// Aqui criamos uma class Para testar a class Questao
// Essa class Extends TestCase que é do JUnit. Um framework do java para testes unitários.
// Colocaremos os métodos da class Questão que queremos testar na class QuestaoTest, precedido de test.
public class QuestaoTest extends TestCase {

	// Aqui testamos o método GravarPergunta() da class Questão
	public void testGravarPergunta() throws IOException {

		// Método para testar. No primeiro parâmetro vai uma mensagem se der
		// erro, no segundo o retorno esperado e no terceiro
		// Executamos o método a ser testado
		assertEquals("Aconteceu algo ao gravar perguntas. ", true, Questao.gravarPergunta("Pergunta de teste?"));
	}

	// Aqui testamos o método GravarResposta() da class Questão
	public void testGravarResposta() throws IOException {

		// Método para testar. No primeiro parâmetro vai uma mensagem se der
		// erro, no segundo o retorno esperado e no terceiro
		// Executamos o método a ser testado
		assertEquals("Aconteceu algo ao gravar respostas. ", true, Questao.gravarResposta("Resposta pergunta de teste."));
	}

}
