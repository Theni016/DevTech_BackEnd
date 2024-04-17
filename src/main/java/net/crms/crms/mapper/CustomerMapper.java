package net.crms.crms.mapper;

import net.crms.crms.dto.CustomerDto;
import net.crms.crms.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer){
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getEmail(),
                customer.getPhone(),
                customer.getIssue(),
                customer.getDeliverystatus()
        );
    }

    public static Customer mapToCustomer(CustomerDto customerDto){
        return new Customer(
                customerDto.getId(),
                customerDto.getName(),
                customerDto.getEmail(),
                customerDto.getPhone(),
                customerDto.getIssue(),
                customerDto.getDeliverystatus()
        );
    }

}
