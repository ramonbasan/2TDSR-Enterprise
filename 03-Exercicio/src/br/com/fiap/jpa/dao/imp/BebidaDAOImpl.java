package br.com.fiap.jpa.dao.imp;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.BebidaDAO;
import br.com.fiap.jpa.entity.Bebida;

public class BebidaDAOImpl implements BebidaDAO{
	
	private EntityManager em;
	
	//Construtor
	public BebidaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public Bebida cadastrar(Bebida bebida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bebida atualizar(Bebida bebida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bebida buscar(int codigo) {
		 TODO Auto-generated method stub
		return null;
	}
	
	

}
