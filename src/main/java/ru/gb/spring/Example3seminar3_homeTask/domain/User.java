package ru.gb.spring.Example3seminar3_homeTask.domain;

import org.springframework.stereotype.Component;

@Component
public class User {

    //region Fields
    private String Name;
    private int age;
    private String email;
    //endregion

    // region Properties
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //endregion
}
