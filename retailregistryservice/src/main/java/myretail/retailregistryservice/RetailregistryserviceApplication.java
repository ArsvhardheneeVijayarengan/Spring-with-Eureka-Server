package myretail.retailregistryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RetailregistryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailregistryserviceApplication.class, args);
	}

}
