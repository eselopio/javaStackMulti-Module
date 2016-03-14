package com.opiosoft.todo.test;

import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import com.opiosoft.todo.dao.TodoTableDao;
import com.opiosoft.todo.entities.TodoTable;


public class TodoTableDaoTest {

	Logger log = Logger.getLogger("TodoTableDaoTest");
	
	private TodoTableDao todo;
	
	//@Test
		public void testTodoTableDaoInsertar() {

			log.debug("Inicio testTodoTableDaoInsertar");
			TodoTable todoTable = new TodoTable("prueba");
			
			todo.insertar(todoTable);
			
			assertTrue(todoTable.getCodigo() != null);

			log.debug("Fin testTodoTableDaoInsertar");
			
		}
	
	
	/*	
	public static void main(String[] args) {
		Logger log = Logger.getLogger("TodoTableTest");
		
		log.info("main");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TodoTablePU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		// No se debe especificar el ID, ya que se genera en automático
		TodoTable todoTable = new TodoTable("Sexto");
		TodoTable todoTableFind = new TodoTable(new Integer(1));
		
		log.debug("Objeto a persistir:" + todoTable);
		em.persist(todoTable);
		
		tx.commit();
		log.debug("Objeto persistido:" + todoTable);
		em.close();

		
		
		
	}*/
}
