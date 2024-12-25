package org.example;

import java.io.*;

public class Program {

    public static void main(String[] args) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person0.dat"))){
            Person person0 = new Person("John", 35);
            oos.writeObject(person0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person0.dat"))){
            Person person0 = (Person)ois.readObject();
            System.out.printf("Name: %s, age: %d \n", person0.getName(), person0.getAge());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
