package model;

import interfaces.Executable;

public class Junior extends Employee implements Executable {
    public Junior(String name, int id, int age, String gender, double experience, double salary) {
        super(name, id, age, gender, experience, salary);
    }

    @Override
    public void execute() {

    }
}
