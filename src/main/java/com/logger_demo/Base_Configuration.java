package com.logger_demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Base_Configuration {
	
	//factory design pattern
	
	static Logger log = Logger.getLogger(Base_Configuration.class);

	public static void main(String[] args) {
		
		// Configuration
		
		BasicConfigurator.configure();
		
		log.debug("Debug");
		
		log.info("Info");
		
		log.warn("Warning");
		
		log.error("Error");
		
		log.fatal("Fatal");
		
	}

}
