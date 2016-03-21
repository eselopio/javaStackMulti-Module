package com.opiosoft.todo.ejb;

import java.util.List;

import javax.ejb.Local;

import com.opiosoft.todo.entities.TodoTable;

@Local
public interface TodoTableService {
	
	
	/*
	 * 
	 * 	public List<TodoTable> recuperarAll();

	// TO DO ANY
	public TodoTable recuperarPorCodigo(Integer codigo);

	// TO DO LUIS
	public void insertar(TodoTable todoTable);

	// TO DO CHOKKO
	public void actualizar(TodoTable todoTable);

	// TO DO ANY
	public void eliminar(TodoTable todoTable);

	 */
	
	public List<TodoTable> recuperarTodoTableAll();
	
}
