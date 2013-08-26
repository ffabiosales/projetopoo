package questao;
/**
 * @author Fabio sales
 * @author Osmar Oliveira
 * @author Márcio David
 *@author Victor
 */
import javax.swing.JOptionPane;
import java.io.IOException;

// Criamos a class Pergunta que herda tudo da class Questao
public class Pergunta extends Questao {

	//Iniciamos duas variáveis para receber as perguntas e respostas inseridas pelo usuário.
	private String conteudoPergunta, conteudoResposta;

	// Aqui temos o métodos para cadastras uma nova pergunta.
	public void cadastrarPergunta()  {

		try {

			conteudoPergunta = JOptionPane.showInputDialog("Digite uma nova pergunta");

			if (conteudoPergunta != null) {

				Pergunta.gravarPergunta(conteudoPergunta);

				conteudoResposta = JOptionPane.showInputDialog("Digite a resposta da pergunta");

				if (conteudoResposta != null) {
					
					Resposta.gravarResposta(conteudoResposta);
					
				}

			}

		}
		catch(IOException e) {
			
		}


	}

}
