package LessonsJavaCore_12.Task_1;

import LessonsJavaCore_11.Auto.Auto;
import LessonsJavaCore_11.Auto.Engine;
import LessonsJavaCore_11.Auto.Helm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static MyClassesToWork.Print.print;

public class autoArrayMain {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        print("1 : Створити двовимірний масив, величина якого вираховується рандомно x");
        print("2 : Для всіх обєктів даного масиву засетати одне значення  ");


        List<Auto> autoList = new ArrayList<>();

        for (int i = 0 ; i<randomGeneret(1,5);i++){
            List<Auto> autoList1 = new ArrayList<>();
            for (int j = 0; j<randomGeneret(1,5);j++){
                autoList1.add(new Auto(randomGeneret(150, 250),
                        randomGeneret(1980, 2020),
                        new Engine(randomGeneret(2,6)),
                        new Helm(randomGeneret(35,44),"Alcantara")));
            }
            autoList.addAll(autoList1);
        }

        int read = scanner.nextInt();

        switch (read){
            case 1:{
                print(autoList.toString());
            }
            case 2:{
                Auto auto = new Auto(100,2008,
                        new Engine(10),new Helm(15,"Alcantara"));
                List<Auto> autos = new ArrayList<>();

                for (int i = 0;i<randomGeneret(1,5);i++){
                    autos.add(auto);
                }
                print(autos.toString());
            }
        }


    }
    static int randomGeneret(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Min value must be less than max value!");
        }

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
