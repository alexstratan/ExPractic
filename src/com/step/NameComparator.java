package com.step;

import java.util.Comparator;

    public class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {

            // pentru a folosi birthDate:
            // if(p1.getBirthDate().isEqual(p2.getBirthDate())) return 0;
            // else if(p1.getBirthDate().isBefore(p2.getBirthDate())) return -1;
            // else return 1;

            if(p1.getName().toLowerCase().charAt(0)==p2.getName().toLowerCase().charAt(0))
            {
                return 0;
            }
            else if(p1.getName().toLowerCase().charAt(0)>p2.getName().toLowerCase().charAt(0)){
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }

