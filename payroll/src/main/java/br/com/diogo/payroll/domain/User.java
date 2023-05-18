package br.com.diogo.payroll.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
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
