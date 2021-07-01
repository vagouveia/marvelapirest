package br.com.zup.marvel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MarvelapirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelapirestApplication.class, args);
	}

}
