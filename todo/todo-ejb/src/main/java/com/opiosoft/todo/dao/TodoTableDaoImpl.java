package com.opiosoft.todo.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.opiosoft.todo.entities.TodoTable;

@Stateless
public class TodoTableDaoImpl implements TodoTableDao {
	
	@PersistenceContext(unitName = "TodoTablePU")
	EntityManager em;
	
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
		em.persist(todoTable);
	}

	@Override
	public void actualizar(TodoTable todoTable) {
		// TODO Auto-generated method stub
		em.merge(todoTable);
	}

	@Override
	public void eliminar(TodoTable todoTable) {
		// TODO Auto-generated method stub
		todoTable = em.find(TodoTable.class, todoTable.getCodigo());
		em.remove(todoTable);
	}

}
