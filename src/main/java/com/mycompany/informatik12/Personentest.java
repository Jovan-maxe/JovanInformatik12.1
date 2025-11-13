/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.informatik12;
/**
 *
 * @author jovan.gehrke
 */

public class Personentest {
    
    public class Person {

        private String name;

        public Person() {
        }

        public Person(String thename) {
            name = thename;
        }

        public void setName(String thename) {
            name = thename;
        }

        public String getName() {
            return name;
        }

        public void printName() {
            System.out.println(name);
        }
    }
    
        public void main(String[] args) {
        Person p = new Person();
        /**/
        p.setName("Meier");
        p.printName();
        p.setName("Müller");
        System.out.println(p.getName());
        }
}


