package br.com.properties.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertiesApplication {
	
	@Autowired
	private static Teste teste;

	PropertiesApplication(Teste teste) {
		this.teste = teste;
	}

	public static void main(String[] args) {
		SpringApplication.run(PropertiesApplication.class, args);
		testarProperties();
		
	}

	public static void testarProperties() {
		teste.testarProperties();
		
	}

}
