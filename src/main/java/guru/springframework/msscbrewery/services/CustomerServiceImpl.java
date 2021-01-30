package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("John Doe")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customer) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Jane Doe")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customer) {
        log.warn("Customer updated!");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.warn("Customer deleted!");
    }
}