package com.aiteam.fintech.auth.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PasswordResetCodeRequest {
    private String email;

    private String code;

    private String newPassword;
}
