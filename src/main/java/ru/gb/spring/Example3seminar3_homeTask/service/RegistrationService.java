package ru.gb.spring.Example3seminar3_homeTask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.spring.Example3seminar3_homeTask.domain.User;

@Service
public class RegistrationService {

    @Autowired
    private DataProcessingService dataProcessingService;

    //region Поля UserService, NotificationService
    @Autowired
    private UserService service;
    @Autowired
    private NotificationService notification;

    //endregion

    //Метод processRegistration
    public void processRegistration(User user){
        dataProcessingService.addUserToList(user);
        notification.sendNotification("User: " + user.getName() + " added to repository");
    }

    public DataProcessingService getDataProcessingService(){
        return  dataProcessingService;
    }

}
