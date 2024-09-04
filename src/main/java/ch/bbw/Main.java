package ch.bbw;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        {   // Musterdaten
            persons.add(new Person(25, "Max", "Berlin", "Software Engineer"));
            persons.add(new Person(30, "Sara", "Hamburg", "Data Scientist"));
            persons.add(new Person(22, "John", "Munich", "Product Manager"));
            persons.add(new Person(28, "Anna", "Berlin", "UX Designer"));
            persons.add(new Person(35, "Tom", "Cologne", "Marketing Specialist"));
            persons.add(new Person(40, "Lisa", "Frankfurt", "HR Manager"));
            persons.add(new Person(29, "Paul", "Berlin", "DevOps Engineer"));
            persons.add(new Person(33, "Sophie", "Hamburg", "Graphic Designer"));
            persons.add(new Person(27, "David", "Munich", "Business Analyst"));
            persons.add(new Person(24, "Emma", "Cologne", "Frontend Developer"));
        }

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
