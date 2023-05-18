package br.com.diogo.userapi;

import br.com.diogo.userapi.Domain.User;
import br.com.diogo.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(
            List.of(
                new User("Diogo", "dg@mail.com", "123", 826.0),
                new User("Fabrino", "Fabrino@mail.com", "1234", 235.0),
                new User("Raphael", "Raphael@mail.com", "43123", 846.0),
                new User("Landim", "Landim@mail.com", "123", 235.0),
                new User("Raissa", "Raissa@mail.com", "123", 357.0)
            )
        );
    };
}
