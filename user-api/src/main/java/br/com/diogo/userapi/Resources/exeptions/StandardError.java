package br.com.diogo.userapi.Resources.exeptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StandardError {
    private String timestamp;
    private String error;
    private Integer status;
    private String path;
}
