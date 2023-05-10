package br.com.diogo.userapi.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import static lombok.EqualsAndHashCode.Include;

import static jakarta.persistence.GenerationType.IDENTITY;
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "tb_user")
public class User {
    @Include
    @Id
    @GeneratedValue(strategy = IDENTITY)
    long id;
    private String name;
    private String email;
    private String password;
    private Double HourlyPrice;

    public User(String name, String email, String password, double HourlyPrice) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.HourlyPrice = HourlyPrice;
    }
}
