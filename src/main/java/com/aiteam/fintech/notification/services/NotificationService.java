package com.aiteam.fintech.notification.services;

import com.aiteam.fintech.auth.entity.User;
import com.aiteam.fintech.notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, User user);
}
