package com.opiosoft.todo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.opiosoft.todo.entities.TodoTable;

public class TodoTableDaoImpl implements TodoTableDao {

	@PersistenceContext(unitName = "TodoTablePU")
	EntityManager em;

	
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
		em.persist(todoTable);

	}

	@Override
	public void actualizar(TodoTable todoTable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(TodoTable todoTable) {
		// TODO Auto-generated method stub

	}

}
