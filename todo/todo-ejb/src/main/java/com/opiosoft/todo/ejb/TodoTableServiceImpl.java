package com.opiosoft.todo.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.opiosoft.todo.dao.TodoTableDao;
import com.opiosoft.todo.entities.TodoTable;

@Stateless
public class TodoTableServiceImpl implements TodoTableService {

	
	@EJB
	private TodoTableDao todoTableDao;
	
	@Override
	public List<TodoTable> recuperarTodoTableAll() {
		// TODO Auto-generated method stub
		return todoTableDao.recuperarAll();
	}

}
