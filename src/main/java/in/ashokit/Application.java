package in.ashokit;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	HashMap<Integer, String> map=null;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
