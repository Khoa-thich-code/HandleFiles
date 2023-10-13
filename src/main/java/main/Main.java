package main;

import controller.HandlesFiles;
import model.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        new HandlesFiles(person).run();
    }
    
}