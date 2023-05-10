package br.com.diogo.userapi.Resources.exeptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StandardError {
    private String timestamp;
    private String error;
    private Integer status;
    private String path;
}
