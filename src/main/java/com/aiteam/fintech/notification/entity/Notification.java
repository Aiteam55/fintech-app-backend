package com.aiteam.fintech.notification.entity;

import com.aiteam.fintech.audit.entity.Auditable;
import com.aiteam.fintech.auth.entity.User;
import com.aiteam.fintech.common.enums.NotificationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notifications")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notification extends Auditable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;
    private String recipient;

    private String body;

    @Enumerated(EnumType.STRING)
    private NotificationType type; // EMAIL, SMS, PUSH

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
