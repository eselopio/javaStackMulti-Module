package com.opiosoft.todo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.opiosoft.todo.entities.TodoTable;

public class TodoTableDaoImpl implements TodoTableDao {
	
	/*@PersistenceContext(unitName = "TodoTablePU")
	EntityManager em;*/
	private EntityManager em;
	private EntityTransaction tx;
	
	public TodoTableDaoImpl(){
		em = Persistence.createEntityManagerFactory("TodoTablePU").createEntityManager();
		tx = em.getTransaction();
	}
	
	
	@Override
	public List<TodoTable> recuperarAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TodoTable recuperarPorCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(TodoTable todoTable) {
		// TODO Auto-generated method stub
		tx.begin();
		em.persist(todoTable);
		tx.commit();
		em.close();
	}

	@Override
	public void actualizar(TodoTable todoTable) {
		// TODO Auto-generated method stub
		tx.begin();
		em.merge(todoTable);
		tx.commit();
		em.close();

	}

	@Override
	public void eliminar(TodoTable todoTable) {
		// TODO Auto-generated method stub

	}

}
