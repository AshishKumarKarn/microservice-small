package karn.ashish.karneurekaserverms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KarnEurekaServerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarnEurekaServerMsApplication.class, args);
	}

}
