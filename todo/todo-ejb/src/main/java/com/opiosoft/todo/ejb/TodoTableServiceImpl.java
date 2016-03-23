package com.opiosoft.todo.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.opiosoft.todo.dao.TodoTableDao;
import com.opiosoft.todo.entities.TodoTable;
import com.opiosoft.todo.servicioWeb.TodoTableWS;

@Stateless
@WebService(endpointInterface = "com.opiosoft.todo.servicioWeb.TodoTableWS")
public class TodoTableServiceImpl implements TodoTableService,TodoTableWS {

	
	@EJB
	private TodoTableDao todoTableDao;
	
	@Override
	public List<TodoTable> recuperarTodoTableAll() {
		// TODO Auto-generated method stub
		return todoTableDao.recuperarAll();
	}

}
