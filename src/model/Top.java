package model;

import interfaces.Organizable;

public class Top extends Employee implements Organizable {
    public Top(String name, int id, int age, String gender, double experience, double salary) {
        super(name, id, age, gender, experience, salary);
    }

    @Override
    public void organize() {

    }
}
