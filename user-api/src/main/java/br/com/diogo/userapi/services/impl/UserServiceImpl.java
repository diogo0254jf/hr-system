package br.com.diogo.userapi.services.impl;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.diogo.userapi.Domain.User;
import br.com.diogo.userapi.repositories.UserRepository;
import br.com.diogo.userapi.services.UserService;
import br.com.diogo.userapi.services.exeptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor()
@Service
public class UserServiceImpl implements UserService {
    private final Environment env;
    private final UserRepository repository;


    @Override
    public User findById(Long id) {
        log.info("PAYROLL SERVICE - getPayment" + env.getProperty("local.server.port"));

        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
