package org.example.employee;

import java.util.ArrayList;
import java.util.Random;

public class Pilot extends EmployeeDetails {

    private String name;

    private String birthDate;
    private ArrayList <String> list = new ArrayList<>();


    public  boolean hasCompass;
    public boolean isCapitan ;


    private static Random rand = new Random();

    public Pilot(String birthDate, String name) {
        super(birthDate, name);
        this.isCapitan = rand.nextBoolean();
    }

    public boolean isCapitan() {
        return isCapitan;
    }

    public void setCapitan(boolean capitan) {
        isCapitan = capitan;
    }

    public void checkCapitan(){
        if (hasCompass) {
          System.out.println(isCapitan);

        }else{
            System.out.print("failed");
        }
    }
}


