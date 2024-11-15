package ma.xproce.modelmapperdemo;

import ma.xproce.modelmapperdemo.dtos.CustomerDTO;
import ma.xproce.modelmapperdemo.entities.Customer;
import ma.xproce.modelmapperdemo.mappers.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class ModelMapperDemoApplication {

    @Autowired
    private CustomerMapper customerMapper;

    public static void main(String[] args) {
        SpringApplication.run(ModelMapperDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner start() {
        return args -> {
            // Créer 3 customers avec le builder
            List<Customer> customers = List.of(
                    Customer.builder().id(1L).name("Hiba SBAI").email("hiba@example.com").password("1234").build(),
                    Customer.builder().id(2L).name("Heba LADRAA").email("heba@example.com").password("abcd").build(),
                    Customer.builder().id(3L).name("Ibtissam SAADALI").email("ibtissam@example.com").password("5678").build()
            );

            // Transformer les customers en customerDTO
            List<CustomerDTO> customerdtoslist = customers.stream()
                    .map(customerMapper::fromCustomer)
                    .collect(Collectors.toList());

            // Afficher les DTOs
            customerdtoslist.forEach(System.out::println);
        };
    }
}