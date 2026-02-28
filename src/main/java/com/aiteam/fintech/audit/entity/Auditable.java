package com.aiteam.fintech.audit.entity;


import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Auditable {
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt =  LocalDateTime.now();
    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime updatedAt;
}
