package ru.pyanov.SpringHW_3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pyanov.SpringHW_3.domain.User;

/**
 * Служба регистрации
 */
@Service
public class RegistrationService {

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    @Autowired
    private DataProcessingService dataProcessingService;

    //Поля UserService, NotificationService
    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    //Метод processRegistration
    public void processRegistration(User user) {
        userService.createUser(user.getName(), user.getAge(), user.getEmail());
        dataProcessingService.addUserToList(user);
        notificationService.notifyUser(user);
    }
}
