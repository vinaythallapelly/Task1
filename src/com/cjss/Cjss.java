package com.cjss;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cjss {
    public static void main(String[] args) {

        Department dept1 = new Department("101", "healthCare");
        Department dept2 = new Department("102", "finance");
        Department dept3 = new Department("103", "admin");
        Department dept4 = new Department("104", "fraud");


        List<Department> dept = new ArrayList<>();
        dept.add(dept1);
        dept.add(dept2);
        dept.add(dept3);
        dept.add(dept4);

        Location lcn1 = new Location("1001", "Hyderabad", "India");
        Location lcn2 = new Location("1002", "Chennai", "India");
        Location lcn3 = new Location("1003", "London", "United Kingdom");

        List<Location> lcn = new ArrayList<>();
        lcn.add(lcn1);
        lcn.add(lcn2);
        lcn.add(lcn3);

        Benefits bnft1 = new Benefits("1231", "Insurance", "Insurance is healthcare service.");
        Benefits bnft2 = new Benefits("1232", "Travel", "Providing Travel service.");
        Benefits bnft3 = new Benefits("1233", "EPF", "Employees' Provident Fund (EPF) is a retirement benefit scheme maintained by the EPFO.");

        List<Benefits> bnft = new ArrayList<>();
        bnft.add(bnft1);
        bnft.add(bnft2);
        bnft.add(bnft3);

        // Using Constructor for Initialization

        Employee employee1=new Employee("1111","Vinay","37000",Arrays.asList(bnft1,bnft2,bnft3),Arrays.asList(lcn1),Arrays.asList(dept1));
        Employee employee2=new Employee("1112","Harish","34000",Arrays.asList(bnft1,bnft2),Arrays.asList(lcn3),Arrays.asList(dept2));
        Employee employee3=new Employee("1113","Ram","35000",Arrays.asList(bnft1,bnft3),Arrays.asList(lcn2),Arrays.asList(dept3));
        Employee employee4=new Employee("1114","Rudra","36000",Arrays.asList(bnft1,bnft2,bnft3),Arrays.asList(lcn2),Arrays.asList(dept4));

        List<Employee> employee=new ArrayList<>();
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);

        /*using setter and getters for Employee class*/

//        Employee employee1 = new Employee();
//        employee1.setEmployeeId("1111");
//        employee1.setEmployeeName("Vinay");
//        employee1.setSalary("37000");
//        employee1.setBenefitId(Arrays.asList(bnft1, bnft2, bnft3));
//        employee1.setLocationId(Arrays.asList(lcn1));
//        employee1.setDeptId(Arrays.asList(dept1));
//
//
//        Employee employee2 = new Employee();
//        employee2.setEmployeeId("1112");
//        employee2.setEmployeeName("Harish");
//        employee2.setSalary("34000");
//        employee2.setBenefitId(Arrays.asList(bnft1, bnft2));
//        employee2.setLocationId(Arrays.asList(lcn3));
//        employee2.setDeptId(Arrays.asList(dept2));
//
//        Employee employee3 = new Employee();
//        employee3.setEmployeeId("1113");
//        employee3.setEmployeeName("Ram");
//        employee3.setSalary("35000");
//        employee3.setBenefitId(Arrays.asList(bnft3, bnft1));
//        employee3.setLocationId(Arrays.asList(lcn2));
//        employee3.setDeptId(Arrays.asList(dept3));
//
//        Employee employee4 = new Employee();
//        employee4.setEmployeeId("1114");
//        employee4.setEmployeeName("Rudra");
//        employee4.setSalary("36000");
//        employee4.setBenefitId(Arrays.asList(bnft3, bnft1, bnft2));
//        employee4.setLocationId(Arrays.asList(lcn2));
//        employee4.setDeptId(Arrays.asList(dept4));

//        List<Employee> employee = new ArrayList<>();
//        employee.add(employee1);
//        employee.add(employee2);
//        employee.add(employee3);
//        employee.add(employee4);

        //Task-1 getting India Employees

        System.out.println("Retrieved all employees in India:");
        System.out.println();
        employee.forEach(employee5 -> {employee5.getLocationId().stream()
                .filter(employeee->employeee.getLocationCountry().equals("India")).forEach(employ->{
                    System.out.println(employee5.getEmployeeId()+" - "+employee5.getEmployeeName()+" - "+
                            employ.getLocationName()+" - "+employ.getLocationCountry());
                });
        });


        //Task-2 getting Chennai or Hyderabad Employees
        System.out.println();
        System.out.println("Retrieved employees who are in Chennai or Hyderabad:");
        System.out.println();
        employee.forEach(employee5 -> {
            employee5.getLocationId().stream()
                    .filter(employeee->employeee.getLocationName().equals("Chennai")||
                           (employeee.getLocationName().equals("Hyderabad")))
                    .forEach(employ->{
                        System.out.println(employee5.getEmployeeId()+" - "+employee5.getEmployeeName()+" - "+
                                employ.getLocationName());
                    });
        });

        //Task-3 getting Benefits of Each Employee
        System.out.println();
        System.out.println("Retrieved employees who have Benefits and display benefits details:");
        System.out.println();
        employee.forEach(employee5 -> {
            System.out.println(employee5.getEmployeeId()+" - "+employee5.getEmployeeName()+" :");
            employee5.getBenefitId().stream().forEach(employ->{
                        System.out.println("-----> Benefit Id: "+ employ.getBenefitId()+ " - Benefit Name: "
                                +employ.getBenefitName()+" - Description:"+ employ.getDescription());
                    });
        });

        //Task-4 Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry
        System.out.println();
        System.out.println("Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry");
        System.out.println();
        employee.stream().forEach(employeeee->{
            employeeee.getDeptId().forEach(departmentt -> {
                employeeee.getLocationId().forEach(locationn ->{
                    System.out.println(employeeee.getEmployeeId()+" - "+employeeee.getEmployeeName()+" - "+
                            employeeee.getSalary()+" - "+departmentt.getDeptName()+" - "+
                            locationn.getLocationName()+" - "+locationn.getLocationCountry());
                } );
            });
        });

        //Task-5 Retrieve employees who are in Chennai and India
        System.out.println();
        System.out.println("Retrieved employees who are in Chennai and India:");
        System.out.println();
        employee.forEach(employee5 -> {
            employee5.getLocationId().stream().filter(employeee->employeee.getLocationName().equals("Chennai")&&
                            (employeee.getLocationCountry().equals("India")))
                    .forEach(employ->{
                        System.out.println(employee5.getEmployeeId()+" - "+employee5.getEmployeeName()+" - "+
                                employ.getLocationName()+" - "+employ.getLocationCountry());
                    });
        });
    }
}