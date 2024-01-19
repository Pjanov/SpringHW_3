package ru.pyanov.SpringHW_3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pyanov.SpringHW_3.repositopy.UserRepository;
import ru.pyanov.SpringHW_3.domain.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Служба обработки данных
 */
@Service
public class DataProcessingService {

    public UserRepository getRepository() {
        return repository;
    }

    @Autowired
    private UserRepository repository;


    public List<User> sortUsersByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }

    public List<User> filterUsersByAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }

    public void addUserToList(User user) {
        repository.getUsers().add(user);
    }
}
