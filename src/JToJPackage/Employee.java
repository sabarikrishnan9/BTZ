package JToJPackage;

import java.io.Serializable;

public class Employee  implements Serializable {

    private int empNo;
    private String name;
    private double salary;

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}