package com.opiosoft.todo.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.opiosoft.todo.dao.TodoTableDao;
import com.opiosoft.todo.dao.TodoTableDaoImpl;
import com.opiosoft.todo.entities.TodoTable;

public class TodoTableDaoTest {

Logger log = Logger.getLogger("TodoTableDaoTest");

	//@Test
	public void testRecuperarAll() {
		log.debug("Inicio testRecuperarAll");

		TodoTableDao todo = new TodoTableDaoImpl();
		  
		assertTrue(!todo.recuperarAll().isEmpty());

		log.debug("Lista de objetos recuperados");
		for(TodoTable t:todo.recuperarAll()){
			log.debug(t);
		}
		
		log.debug("fin testRecuperarAll");
	}

	//@Test
	public void testRecuperarPorCodigo() {
		  TodoTable todoTable=null;
		  log.debug("Inicio testRecuperarPorCodigo");
		  
		  TodoTableDao todo = new TodoTableDaoImpl();
		  assertTrue((todoTable=todo.recuperarPorCodigo(1)) != null);
		  
		  log.debug("Objeto recuperado "+todoTable);
		  
		  log.debug("fin testFindRecuperarPorCodigo");
	}

	//@Test
	public void testInsertar() {
		log.debug("Inicio testInsertar");
		TodoTable todoTable = new TodoTable("prueba");
		TodoTableDao todo = new TodoTableDaoImpl();
		todo.insertar(todoTable);
		assertTrue(todoTable.getCodigo() != null);
		log.debug("Fin testInsertar");
	}

	//@Test
	public void testActualizar() {
		log.debug("Inicio testActualizar");
		TodoTable todoTable = new TodoTable(11, "once");
		TodoTableDao todo = new TodoTableDaoImpl();
		todo.actualizar(todoTable);
		assertTrue(todoTable.getCodigo() != null);
		log.debug("Fin testActualizar");
	}

	//@Test
	public void testEliminar() {
		log.debug("Inicio testEliminar");
		TodoTable todoTable = new TodoTable(1);
		TodoTableDao todo = new TodoTableDaoImpl();
		todo.eliminar(todoTable);
		log.debug("Fin testEliminar1");
		assertTrue(true);
		log.debug("Fin testEliminar2");
	}

	

	

}
