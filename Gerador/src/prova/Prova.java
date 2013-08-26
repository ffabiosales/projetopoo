package prova;
/**
 * @author Fabio sales
 * @author Osmar Oliveira
 * @author Márcio David
 *@author Victor
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class Prova {

	private int quantidade;

	private float valor;

	public int  getQuantidade() {
		return quantidade;
	}

	public  void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean gerarProva() throws IOException {
		FileInputStream perguntas = null;
		FileOutputStream provaArquivo = null;
		BufferedReader lerPergunta = null;
		String quantidadePergunta = null;
		try {

			quantidadePergunta = JOptionPane
					.showInputDialog("Quantas perguntas terá a prova?");

			if (quantidadePergunta != null) {
				
				int quant = Integer.parseInt(quantidadePergunta);

				this.setQuantidade(quant);

				perguntas = new FileInputStream("perguntas.txt");

				lerPergunta = new BufferedReader(new InputStreamReader(
						perguntas));

				provaArquivo = new FileOutputStream("prova.txt");

				OutputStreamWriter escreve = new OutputStreamWriter(
						provaArquivo);

				BufferedWriter prova = new BufferedWriter(escreve);

				String line = lerPergunta.readLine();

				line += System.getProperty("line.separator");

				int i = 1;

				while (line != null) {

					prova.write("Questao " + i + ": " + line);

					line = lerPergunta.readLine();

					line += System.getProperty("line.separator");

					if (i++ >= getQuantidade()) {

						break;

					}
				}

				prova.close();
				perguntas.close();
				provaArquivo.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		if (quantidadePergunta != null) {
			return true;
		} else {
			return false;
		}
	}

}
