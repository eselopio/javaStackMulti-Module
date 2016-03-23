package com.opiosoft.todo.servicioWeb;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.opiosoft.todo.entities.TodoTable;

@WebService
public interface TodoTableWS {
	@WebMethod
	public List<TodoTable> recuperarTodoTableAll();

}