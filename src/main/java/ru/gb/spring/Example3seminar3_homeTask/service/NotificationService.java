package ru.gb.spring.Example3seminar3_homeTask.service;

import org.springframework.stereotype.Service;
import ru.gb.spring.Example3seminar3_homeTask.domain.User;

@Service
public class NotificationService {
    public void notifyUser(User user){
        System.out.println("At new user has been created: " + user.getName());
    }

    public void sendNotification(String s){
        System.out.println(s);
    }
}
