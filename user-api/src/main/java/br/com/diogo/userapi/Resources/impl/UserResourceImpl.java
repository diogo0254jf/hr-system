package br.com.diogo.userapi.Resources.impl;

import br.com.diogo.userapi.Domain.User;
import br.com.diogo.userapi.Resources.UserResource;
import br.com.diogo.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource {

    private final UserService service;


    @Override
    public ResponseEntity<User> findById(String id) {
        return ResponseEntity.ok().body(service.findById(Long.parseLong(id)));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
