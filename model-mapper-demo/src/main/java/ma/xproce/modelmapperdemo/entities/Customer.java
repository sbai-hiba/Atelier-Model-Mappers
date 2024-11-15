package ma.xproce.modelmapperdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
