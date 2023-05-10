package br.com.diogo.userapi.Resources.exeptions;

import br.com.diogo.userapi.services.exeptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(ObjectNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<StandardError> ObjectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
        return ResponseEntity.ok().body(
                new StandardError(LocalDateTime.now(),ex.getMessage(), HttpStatus.NOT_FOUND.value(), request.getRequestURI())
        );
    }
}
