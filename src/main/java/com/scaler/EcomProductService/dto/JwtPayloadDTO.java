package com.scaler.EcomProductService.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtPayloadDTO {
    @JsonProperty("createdAt")
    private long createdAt;
    @JsonProperty("roles")
    private String[] roles;
    @JsonProperty("expiryAt")
    private long expiryAt;
    @JsonProperty("userId")
    private int userId;
}
