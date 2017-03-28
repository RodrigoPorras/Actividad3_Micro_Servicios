package org.udea.proint1.ms.producto_backend;



import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class Application { 	
	
	// para correc con maven: mvn spring-boot:run
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		BasicConfigurator.configure();
	}
	
}
