package io.agileTool.ppmTool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"Domain"})
public class PpmToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpmToolApplication.class, args);
	}

}
