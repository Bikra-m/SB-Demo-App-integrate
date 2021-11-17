package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	String urp_story1="https://localhost:7070/welcome";
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
