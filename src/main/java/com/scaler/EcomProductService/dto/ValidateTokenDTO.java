package com.scaler.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidateTokenDTO {
    private int userId;
    private String token;

    public ValidateTokenDTO(){

    }

    public ValidateTokenDTO(int userId, String token) {
        this.userId = userId;
        this.token = token;
    }
}
