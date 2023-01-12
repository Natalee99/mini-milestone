package org.example.ready;

import org.example.employee.EmployeeDetails;
import org.example.employee.Languages;
import org.intellij.lang.annotations.Language;

import java.util.ArrayList;
import java.util.Random;

public class ReadyForFlight {
    private ArrayList<EmployeeDetails> flightAttendents = new ArrayList<>();
    private int FlightId;
    private Languages language;
    private static Random rand = new Random();


    public ReadyForFlight(ArrayList<EmployeeDetails> flightAttendents, int flightId, Languages language) {
        this.flightAttendents = flightAttendents;
        FlightId = rand.nextInt();
        this.language = language;
        flightLang = Language.getRandom();
    }






}
