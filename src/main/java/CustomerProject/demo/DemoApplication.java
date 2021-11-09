package CustomerProject.demo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import CustomerProject.demo.model.RootAccount;
import netscape.javascript.JSException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ObjectMapper objectmapper=new ObjectMapper();
		try {
			RootAccount account=objectmapper.readValue(str, RootAccount.class)
			}
		
	}
	
}
