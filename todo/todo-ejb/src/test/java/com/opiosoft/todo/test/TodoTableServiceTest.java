package com.opiosoft.todo.test;

import static org.junit.Assert.*;

import javax.ejb.embeddable.EJBContainer;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.opiosoft.todo.ejb.TodoTableService;
import com.opiosoft.todo.entities.TodoTable;

public class TodoTableServiceTest {

	Logger log = Logger.getLogger("TodoTableServiceTest");

	private TodoTableService todoTableService;

	@Before
	public void setUp() throws Exception {
		EJBContainer contenedor = EJBContainer.createEJBContainer();
		todoTableService = (TodoTableService) contenedor.getContext()
				.lookup("java:global/classes/TodoTableServiceImpl!com.opiosoft.todo.ejb.TodoTableService");
	}

	@Test
	public void testRecuperarTodoTableAll() {
		log.debug("Inicio testRecuperarTodoTableAll");

		assertTrue(todoTableService != null);

		for(TodoTable to:todoTableService.recuperarTodoTableAll()){
			log.debug(to);
		}
		
		log.debug("Fin testRecuperarTodoTableAll");
		
	}

}
