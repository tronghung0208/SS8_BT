package baitap.controller;

import baitap.Developer;
import baitap.Employee;
import baitap.SaleEmployee;

public class EmployeeManagement {

    public static void main(String[] args) {
        Employee employee1=new SaleEmployee(1,"Hùng",20,"English");
   Employee employee2=new Developer(2,"Tâm",30,"Japan");
   employee1.chamCong();
   employee1.work();
   employee2.chamCong();
   employee2.work();
        System.out.println("-------------");
        System.out.println("sale");
        doing(employee1);
        System.out.println("Deverloper");
        doing(employee2);
    }

    public static void doing(Employee employee) {
        if(employee instanceof Developer){
            ((Developer) employee).fixbug();
        } else if(employee instanceof SaleEmployee) {
            ((SaleEmployee) employee).sale();
        }
    }
}
