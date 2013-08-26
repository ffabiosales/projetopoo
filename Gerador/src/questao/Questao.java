package questao;
/**
 * @author Fabio sales
 * @author Osmar Oliveira
 * @author Márcio David
 *@author Victor
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Questao {

	public static boolean gravarPergunta(String pergunta) throws IOException {

		File arquivo = new File("perguntas.txt");

		if (!arquivo.exists()) {

		}

		try {

			if (arquivo.createNewFile()) {

			} else {

			}
		} catch (IOException ex) {

			ex.printStackTrace();

		}

		try {

			FileWriter escreve = new FileWriter(arquivo, true);

			pergunta += System.getProperty("line.separator");

			escreve.write(pergunta);

			escreve.close();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		return true;

	}

	public static boolean gravarResposta(String resposta) throws IOException {

		File arquivo = new File("respostas.txt");

		if (!arquivo.exists()) {

		}

		try {

			if (arquivo.createNewFile()) {

			} else {

			}
		} catch (IOException ex) {

			ex.printStackTrace();

		} 
		
		try {

			FileWriter escreve = new FileWriter(arquivo, true);

			resposta += System.getProperty("line.separator");

			escreve.write(resposta);

			escreve.close();
			
		}
		catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		return true;

	}

}
