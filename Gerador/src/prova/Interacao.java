package prova;
/**
 * @author Fabio sales
 * @author Osmar Oliveira
 * @author Márcio David
 *@author Victor
 */
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import questao.Pergunta;

public class Interacao extends JFrame {

	private static final long serialVersionUID = 1L;

	// criando as strings para o radio button
	private JRadioButton gerar, cadastrar;

	// iniciamos a criação de um grupo com as opções gerar e cadastrar para mostrar na tela. 
	private ButtonGroup grupo;

	// Criando um botão para enviar a escolha do usuário.
	private JButton enviar;

	//Método que cria a o diálogo com radiobutton para o usuário selecionar o que deseja.
	public void iniciar() {

		//Aqui criamos a iniciamos a caixa para a escolha do usuário
		final JFrame telaDialogo = new JFrame("O que você gostaria de fazer?");
		telaDialogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//aqui dizemos o formato que a tela terá e a criamos em dadosTela
		JPanel dadosTela = new JPanel(new GridLayout(0, 1));

		// Criamos um crupo para o radiobutton
		grupo = new ButtonGroup();

		// Instancia e adiciona os dois botões ao grupo que criamos
		add(gerar = new JRadioButton("Gerar prova"));
		add(cadastrar = new JRadioButton("Cadastrar pergunta"));

		// Adicinamos ao grupo, assim somente um será selecionado por vez
		dadosTela.add(gerar);
		grupo.add(gerar);
		dadosTela.add(cadastrar);
		grupo.add(cadastrar);

		// setamos a informação de cada item selecionável. Se selecionado, o valor que terá.
		gerar.setActionCommand("gerarProva");
		cadastrar.setActionCommand("cadastrarPergunta");

		// Criamos um botão para enviar a opção escolhida
		enviar = new JButton("Enviar");
		enviar.setPreferredSize(new Dimension(40, 40));
		
		// Adicionamos o botão a grupo.
		dadosTela.add(enviar);

		// Um listener para o botão. Quando uma escolha for feita,  o metódo abaixo será executado.
		enviar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				//Analisamos a ecolha do usuário. Se for gerarProva, tentamos gerar uma prova.
				if (grupo.getSelection().getActionCommand() == "gerarProva") {
					
					try {
						
						// Criamos um objeto prova
						Prova prova = new Prova();
						
						// Aqui tentamos gerar uma nova prova com o método gerarProva() que retorna um boolean (true/false)
						if (prova.gerarProva()) {
							
							// Se a prova foi gerada é exibido uma mensagem de sucesso na tela.
							JOptionPane.showMessageDialog(null,
									"Sua prova foi gerada");
						}
					} 
					
					catch (IOException e) {

						e.printStackTrace();
						
					}
					
				} 
				
				// Se "Cadastrar pergunta" for escolhido o codígo abaixo será executado.
				else {
					
					// Criamos um objeto pergunta.
					Pergunta pergunta = new Pergunta();
					
					// Cadastramos uma nova pergunta.
					pergunta.cadastrarPergunta();
				}

			}
		});
		
		// Adicionamos todo o conteudo do diálogo inicial
		telaDialogo.add(dadosTela);
		
		//Setamos o tamanho da tela de diálogo
		telaDialogo.setSize(400, 200);
		
		// Tentamos posicionar a tela no meio
		telaDialogo.setLocationRelativeTo(null);
		
		//Mostramos a tela.
		telaDialogo.setVisible(true);

	}
}