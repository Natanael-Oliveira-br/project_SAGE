package br.com.projeto.estoque.util;

import javax.swing.JOptionPane;

public class Aviso {

	public static void avisar(int erro) {
		switch (erro) {
		case 1:
			JOptionPane.showMessageDialog(null, "Preencha todos os campos");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "CPJ já cadastrado no sistema!");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Você não tem permissão para fazer isto!");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "As senhas não são iguais!");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "O que você está procurando não existe no banco de dados");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "O ID tem um valor numérico!");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Digite o ID do supervisor a ser modificado!");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "Atributo modificado com sucesso");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "O Supervisor a ser modificado não existe no banco de dados");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "Digite seu novo login!");
			break;
		case 13:
			JOptionPane.showMessageDialog(null, "Digite sua nova SENHA");
			break;
		default:
			break;
		}
	}

}
