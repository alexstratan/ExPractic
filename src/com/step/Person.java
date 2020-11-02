package com.step;

import java.time.LocalDate;
import java.util.Comparator;

public class Person {

    String name;
    LocalDate birthDate;

    public Person(String name,LocalDate birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }

    public String getName(){return this.name;}
    public LocalDate getBirthDate(){return this.birthDate;}

    public void setName(String name){this.name=name;}
    public void setBirthDate(LocalDate birthDate){this.birthDate=birthDate;}
}

