package com.opiosoft.todo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TodoTable> recuperarAll() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("TodoTable.findAll").getResultList();

	}

	@Override
	public TodoTable recuperarPorCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		  TodoTable todo = em.find(TodoTable.class, codigo);
		  
		  return todo;
	}

	@Override
	public void insertar(TodoTable todoTable) {
		// TODO Auto-generated method stub
		tx.begin();
		em.persist(todoTable);
		tx.rollback();
		em.close();
	}

	@Override
	public void actualizar(TodoTable todoTable) {
		// TODO Auto-generated method stub
		tx.begin();
		em.merge(todoTable);
		tx.rollback();
		em.close();

	}

	@Override
	public void eliminar(TodoTable todoTable) {
		// TODO Auto-generated method stub
		tx.begin();
		todoTable = em.find(TodoTable.class, todoTable.getCodigo());
		em.remove(todoTable);
		tx.rollback(); 
		em.close();

	}

}
