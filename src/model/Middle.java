package model;

import interfaces.Verifiable;

public class Middle extends Employee implements Verifiable {
    public Middle(String name, int id, int age, String gender, double experience, double salary) {
        super(name, id, age, gender, experience, salary);
    }

    @Override
    public void verify() {

    }
}
