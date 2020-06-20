package br.com.projeto.estoque.util;

import br.com.projeto.estoque.model.Gerente;

public class CriaGerente {
	public static void main(String[] args) {
		Essencial.setManager(new JPAUtil().getEntityManager());
		Essencial.getManager().getTransaction().begin();
		Gerente gerente = new Gerente();
		gerente.setCpf("222.222.222-22");
		gerente.setLogin("log");
		gerente.setSenha(Criptografar.encriptografar("123"));
		Essencial.getManager().persist(gerente);
		Essencial.getManager().getTransaction().commit();
		Essencial.getManager().close();
	}
}
