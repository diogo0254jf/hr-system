package br.com.diogo.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.diogo.userapi.Domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
