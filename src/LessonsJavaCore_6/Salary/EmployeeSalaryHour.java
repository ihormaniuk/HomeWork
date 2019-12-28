package LessonsJavaCore_6.Salary;

import java.util.Scanner;

public class EmployeeSalaryHour implements Salary {
    Scanner scanner = new Scanner (System.in);

    @Override
    public void Salary ( ) {
        System.out.println ( "Ведіть зарплату в в годину " );
        int a = scanner.nextInt ();
        System.out.println ( "Ведіть скіль годин ви працюєте у добу" );
        int b = scanner.nextInt ();
        System.out.println ("у добу ваш заробіток складає - " + a * b + " грн");
    }
}
