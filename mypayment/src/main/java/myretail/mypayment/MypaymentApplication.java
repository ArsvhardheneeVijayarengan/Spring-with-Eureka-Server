package myretail.mypayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MypaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypaymentApplication.class, args);
	}

}
