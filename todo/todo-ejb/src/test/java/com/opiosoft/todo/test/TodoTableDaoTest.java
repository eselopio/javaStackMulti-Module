package com.opiosoft.todo.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.opiosoft.todo.dao.TodoTableDao;
import com.opiosoft.todo.dao.TodoTableDaoImpl;
import com.opiosoft.todo.entities.TodoTable;

public class TodoTableDaoTest {

Logger log = Logger.getLogger("TodoTableDaoTest");

	@Test
	public void testRecuperarAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecuperarPorCodigo() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertar() {
		log.debug("Inicio testInsertar");
		TodoTable todoTable = new TodoTable("prueba");
		TodoTableDao todo = new TodoTableDaoImpl();
		todo.insertar(todoTable);
		assertTrue(todoTable.getCodigo() != null);
		log.debug("Fin testInsertar");
	}

	@Test
	public void testActualizar() {
		log.debug("Inicio testActualizar");
		TodoTable todoTable = new TodoTable(11, "once");
		TodoTableDao todo = new TodoTableDaoImpl();
		todo.actualizar(todoTable);
		assertTrue(todoTable.getCodigo() != null);
		log.debug("Fin testActualizar");
	}

	@Test
	public void testEliminar() {
		fail("Not yet implemented");
	}

	

	

}
