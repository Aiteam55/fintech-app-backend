package com.aiteam.fintech;

import com.aiteam.fintech.auth.entity.User;
import com.aiteam.fintech.common.enums.NotificationType;
import com.aiteam.fintech.notification.dtos.NotificationDTO;
import com.aiteam.fintech.notification.services.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class FintechApplication {

	private final NotificationService notificationService;

	static void main(String[] args) {
		SpringApplication.run(FintechApplication.class, args);

	}

//	@Bean
//	CommandLineRunner runner() {
//		return _ -> {
//			NotificationDTO notificationDTO = NotificationDTO.builder()
//					.subject("Hello test email")
//					.recipient("mitiaandria1@gmail.com")
//					.body("testsetsetsetsetset")
//					.type(NotificationType.EMAIL)
//					.build();
//			notificationService.sendEmail(notificationDTO, new User());
//		};
//	}
}
