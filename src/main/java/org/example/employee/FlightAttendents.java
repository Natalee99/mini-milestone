package org.example.employee;

import java.util.ArrayList;

public class FlightAttendents extends EmployeeDetails{

    private ArrayList<Languages> language = new ArrayList<>();

    public FlightAttendents(String birthDate, String name) {
        super(birthDate, name);
        this.language = language;
    }

    public ArrayList<Languages> getLanguage() {
        return language;
    }
}
