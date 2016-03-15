package com.opiosoft.todo.jee;

import org.apache.log4j.Logger;
import org.todo.api.Constantes;

public class TodoApp {
	String modulo = Constantes.nombre_app;
	
	
	
	
	public static void main(String ... args){
		Logger log = Logger.getLogger("TodoApp");
		
		log.info("main");
		
	}

}
