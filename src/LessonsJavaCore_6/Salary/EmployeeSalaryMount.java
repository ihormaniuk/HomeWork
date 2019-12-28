package LessonsJavaCore_6.Salary;

import java.util.Scanner;

public class EmployeeSalaryMount implements Salary {
    Scanner scanner = new Scanner ( System.in );
    @Override
    public void Salary ( ) {
        System.out.println ( "Ведіть зарплату в день " );
        int a = scanner.nextInt ();
        System.out.println ( "Ведіть скіль днів ви працюєте у місяць" );
        int b = scanner.nextInt ();
        System.out.println ("у місяць ваш заробіток складає - " + a * b + " грн");
    }
}
