package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomer(UUID customerId);

    CustomerDto createCustomer(CustomerDto customer);

    void updateCustomer(UUID customerId, CustomerDto customer);

    void deleteCustomer(UUID customerId);
}
