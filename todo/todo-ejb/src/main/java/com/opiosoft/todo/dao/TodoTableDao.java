package com.opiosoft.todo.dao;

import java.util.List;

import com.opiosoft.todo.entities.TodoTable;


public interface TodoTableDao {

	public List<TodoTable> recuperarAll();

	// TO DO ANY
	public TodoTable recuperarPorCodigo(Integer codigo);

	// TO DO LUIS
	public void insertar(TodoTable todoTable);

	// TO DO CHOKKO
	public void actualizar(TodoTable todoTable);

	// TO DO ANY
	public void eliminar(TodoTable todoTable);

	
}
