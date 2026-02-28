package com.aiteam.fintech.auth.dtos;

import com.aiteam.fintech.account.dtos.AccountDTO;
import com.aiteam.fintech.role.entity.Role;
import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String profilePictureUrl;
    private boolean active;
    private List<Role> roles;
    @JsonManagedReference// if helps avoid recursion loop by ignoring the userDTO withing the AccountDTO
    private List<AccountDTO> accounts;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
