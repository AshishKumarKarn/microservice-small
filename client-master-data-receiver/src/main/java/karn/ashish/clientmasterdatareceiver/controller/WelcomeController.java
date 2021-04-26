package karn.ashish.clientmasterdatareceiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

    @GetMapping("/data")
    public String dataController() {
        List<ServiceInstance> instances = discoveryClient.getInstances("client-one".toUpperCase());
        if (instances != null && instances.size() > 0) {
            URI uri = instances.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }
        return null;
    }
}
