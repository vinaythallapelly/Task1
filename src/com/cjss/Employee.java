package com.cjss;


import java.util.List;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String Salary;
    private List<Location> locationId;
    private List<Department> deptId;
    private List<Benefits> benefitId;

    public Employee(String employeeId, String employeeName, String salary,
                    List<Benefits> benefitId,List<Location> locationId, List<Department> deptId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.Salary = salary;
        this.locationId = locationId;
        this.deptId = deptId;
        this.benefitId = benefitId;
    }
    public Employee(){

    }

    //Getter and setters
    
    public String getEmployeeId() {return employeeId;}

    public void setEmployeeId(String employeeId) {this.employeeId = employeeId;}

    public String getEmployeeName() {return employeeName;}

    public void setEmployeeName(String employeeName) {this.employeeName = employeeName;}

    public String getSalary() {return Salary;}

    public void setSalary(String salary) {Salary = salary;}

    public List<Location> getLocationId() {return locationId;}

    public void setLocationId(List<Location> locationId) {this.locationId = locationId;}

    public List<Department> getDeptId() {return deptId;}

    public void setDeptId(List<Department> deptId) {this.deptId = deptId;}

    public List<Benefits> getBenefitId() {return benefitId;}

    public void setBenefitId(List<Benefits> benefitId) {this.benefitId = benefitId;}


}
