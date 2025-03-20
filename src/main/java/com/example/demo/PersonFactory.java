package org.example;

public class PersonFactory {
    public static Person createPerson(){
        Person person = new Person();
        person.setName("Zyox");
        person.setAge(25);
        person.setAddress("Vermillion Domain");
        return person;
    }

    public static void main(String[] args) {
        Person person = PersonFactory.createPerson();

        System.out.println("Hi, my name is "+ person.getName()+". I am " + person.getAge() + " years old and I lived in "+ person.getAddress());
    }
}
