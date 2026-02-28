package com.aiteam.fintech.auth.repository;

import com.aiteam.fintech.auth.entity.PasswordResetCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetCodeRepository extends JpaRepository<PasswordResetCode, String> {
    Optional<PasswordResetCode> findByCode(String code);
    void deleteByUserId(Long userId);
}
