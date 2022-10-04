package com.qualogy.customerdirectmailservice.customerapiclient;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CustomerApiClient {

    public List<Customer> readCustomers() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Customer[]> response
                = restTemplate.getForEntity("http://localhost:8081/customers", Customer[].class);
        Customer[] customers = response.getBody();
        if (customers == null) {
            return Collections.emptyList();
        } else {
            return Arrays.asList(customers);
        }
    }
}
