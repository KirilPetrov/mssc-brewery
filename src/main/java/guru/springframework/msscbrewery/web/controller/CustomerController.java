package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId")UUID customerId) {
        return ResponseEntity.ok().body(customerService.getCustomer(customerId));
    }

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody CustomerDto customer) {
        CustomerDto savedCustomer = customerService.createCustomer(customer);

        return ResponseEntity.created(URI.create("/api/v1/customer/" + savedCustomer.getId())).build();
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("customerId")UUID customerId, @RequestBody CustomerDto customer) {
        customerService.updateCustomer(customerId, customer);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId")UUID customerId) {
        customerService.deleteCustomer(customerId);
    }
}
