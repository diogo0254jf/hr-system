package br.com.diogo.payroll.services;

import java.util.Objects;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.diogo.payroll.domain.Payroll;
import br.com.diogo.payroll.feignClients.userFeign;
import br.com.diogo.payroll.services.exeptions.ObjectNotFoundException;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
public class PayrollService {
    private final Environment env;
    private final userFeign feign;


    public Payroll getPayment(Long workerId, Payroll payroll) {
        log.info("PAYROLL SERVICE - getPayment" + env.getProperty("local.server.port"));

        try {
            var user = feign.findById(workerId).getBody();
            if (Objects.nonNull(user)) {
                return new Payroll (
                    user.getName(), 
                    payroll.getDescription(),
                    user.getHourlyPrice(), 
                    payroll.getWorkedhours(), 
                    payroll.getWorkedhours() * user.getHourlyPrice()
                    );
                }
        } catch (FeignException.NotFound e) {
            throw new ObjectNotFoundException("Object not found exception");

        } catch (Exception e) {
            throw new IllegalArgumentException("Ilegal argument exception");
        }
        return null;
    }






}
