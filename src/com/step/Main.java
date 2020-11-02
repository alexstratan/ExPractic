package com.step;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        De creat o clasa Person (String name, LocalDate birthDate). De creat 1 clasa Main (main()).
//        În Interiorul la main de creat un array list care sa păstreze 5 obiecte
//        person. De sortat colecția respectivă dupa name și de explicat care sunt
//        modificarile necesare pentru a sorta colecția dupa birthdate.

        List<Person> people=new ArrayList<>();



        people.add(new Person("Mike",LocalDate.parse("2006-05-20")));
        people.add(new Person("John",LocalDate.parse("2000-07-12")));
        people.add(new Person("Andrew",LocalDate.parse("2004-05-10")));
        people.add(new Person("Will",LocalDate.parse("2002-12-04")));
        people.add(new Person("Marcus",LocalDate.parse("2001-04-01")));

        Collections.sort(people,new NameComparator());

        for(Person p: people){
            System.out.println("Name: "+p.getName());
        }


    }
}
