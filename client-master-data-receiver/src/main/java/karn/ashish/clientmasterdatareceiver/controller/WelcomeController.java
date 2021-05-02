package karn.ashish.clientmasterdatareceiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class WelcomeController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;


    //http://localhost:8021/v1/data/  To access this, remove load balanced from RestTemplate bean
    @GetMapping("/data")
    public String dataController() {
        List<ServiceInstance> instances = discoveryClient.getInstances("client-one".toUpperCase());
        if (instances != null && instances.size() > 0) {
            URI uri = instances.get(0).getUri();
            if (uri != null) {
                return restTemplate.getForObject(uri, String.class);
            }
        }
        return null;
    }


    //http://localhost:8021/v1/data/loadbalanced
    @GetMapping("/data/loadbalanced")
    public ResponseEntity<String> dataControllerLoadBalanced() {
        return restTemplate
                .exchange("http://CLIENT-ONE/",
                        HttpMethod.GET,
                        null,
                        String.class);

    }
}
