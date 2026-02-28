package com.aiteam.fintech.account.repository;

import com.aiteam.fintech.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findAccountByAccountNumber(String accountNumber);
    Optional<Account> findAccountByUserId(Long user_id);
}
