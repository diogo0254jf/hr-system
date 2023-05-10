package br.com.diogo.userapi.services;

import br.com.diogo.userapi.Domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> findAll();
}
