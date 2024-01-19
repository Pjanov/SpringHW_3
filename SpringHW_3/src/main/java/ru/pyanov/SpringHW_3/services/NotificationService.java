package ru.pyanov.SpringHW_3.services;

import org.springframework.stereotype.Service;
import ru.pyanov.SpringHW_3.domain.User;

/**
 * Служба уведомлений
 */
@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("Создан новый пользователь: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}
