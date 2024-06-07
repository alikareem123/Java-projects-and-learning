package com.example.first;

public class Person {
    private String firstName, lastName;
    private int age;

    public Person(){
        this("Ali", "Kareem", 24);
        System.out.println("Person constructor called with 0 parameters");
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        System.out.println("Inside the parameterised constructor");
        System.out.println("The name of the person is: "+firstName + " " + lastName + " and the age is- " + age);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age > 100 || age < 0){
            age = 0;
        }
        this.age = age;
    }
    public boolean isTeen(){
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        else if(firstName.isEmpty()){
            return lastName;
        }else if(lastName == ""){
            return firstName;
        }else{
            return firstName + " " + lastName;
        }
    }

}
