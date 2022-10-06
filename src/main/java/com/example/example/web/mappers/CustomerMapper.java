package com.example.example.web.mappers;

import com.example.example.data.CustomerDTO;
import com.example.example.domain.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);
    CustomerDTO customerToCustomerDTO(Customer customer);
}
