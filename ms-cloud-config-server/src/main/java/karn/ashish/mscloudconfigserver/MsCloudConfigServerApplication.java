package karn.ashish.mscloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCloudConfigServerApplication.class, args);
	}

}
