package br.com.diogo.userapi.Resources;

import br.com.diogo.userapi.Domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserResource {
    @GetMapping(value = "/{id}")
    ResponseEntity<User> findById(@PathVariable String id);

    @GetMapping()
    ResponseEntity<List<User>> findAll();
}
