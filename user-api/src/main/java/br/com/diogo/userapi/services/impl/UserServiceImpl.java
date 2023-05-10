package br.com.diogo.userapi.services.impl;

import br.com.diogo.userapi.Domain.User;
import br.com.diogo.userapi.repositories.UserRepository;
import br.com.diogo.userapi.services.UserService;
import br.com.diogo.userapi.services.exeptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor()
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;


    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
