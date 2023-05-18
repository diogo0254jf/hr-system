package br.com.diogo.payroll.feignClients;

import java.util.List;



@FeignClient(name = "user-api", path = "https://localhost:8000")
public interface userFeign {

    ResponseEntity<User> findById(@PathVariable Long id);

    ResponseEntity<List<User>> findAll();
    
}
