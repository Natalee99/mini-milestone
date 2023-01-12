package org.example.employee;

import java.util.ArrayList;

public abstract class EmployeeDetails {
 private String name;

 private String birthDate;


 public EmployeeDetails(String birthDate,String name){
  this.birthDate = birthDate;
  this.name = name;
 }


 public void setName(String name) {
  this.name = name;
 }

 public void setBirthDate(String birthDate) {
  this.birthDate = birthDate;
 }

 public String getName() {
  return name;
 }

 public String getBirthDate() {
  return birthDate;
 }

 @Override
 public String toString() {
  return "EmployeeDetails{" +
          "name='" + name + '\'' +
          ", birthDate='" + birthDate + '\'' +
          '}';
 }
}
