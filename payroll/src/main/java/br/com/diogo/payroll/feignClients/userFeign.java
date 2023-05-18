package br.com.diogo.payroll.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.diogo.payroll.domain.User;

@FeignClient(name = "user-api")
public interface userFeign {
    
    @GetMapping("/api/users/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping("/api/users")
    ResponseEntity<List<User>> findAll();
}
