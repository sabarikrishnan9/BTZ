package JToJPackage;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Employee emp1 = new Employee();
        emp1.setEmpNo(1);
        emp1.setName("Sabari");
        emp1.setSalary(360000);

       String jsonEmployee = JsonUtil.convertJavaToJson(emp1);
       System.out.println(jsonEmployee);

       Employee emp2 = JsonUtil.converJsonToJava(jsonEmployee,Employee.class);
        System.out.println(emp2.getEmpNo()+" "+ emp2.getName()+" "+ emp2.getSalary());
    }
}
