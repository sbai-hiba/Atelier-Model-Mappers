package ma.xproce.modelmapperdemo.mappers;

import ma.xproce.modelmapperdemo.dtos.CustomerDTO;
import ma.xproce.modelmapperdemo.dtos.CustomerDtoNew;
import ma.xproce.modelmapperdemo.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private final ModelMapper mapper = new ModelMapper();

    public CustomerDTO fromCustomer(Customer customer) {
        return this.mapper.map(customer, CustomerDTO.class);
    }

    public CustomerDtoNew fromCustomerToDtoNew(Customer customer) {
        return this.mapper.map(customer, CustomerDtoNew.class);
    }
}
