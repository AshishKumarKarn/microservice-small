package karn.ashish.clientmasterdatareceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientMasterDataReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientMasterDataReceiverApplication.class, args);
	}

}
