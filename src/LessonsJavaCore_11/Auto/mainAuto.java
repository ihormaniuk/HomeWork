package LessonsJavaCore_11.Auto;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import static MyClassesToWork.Print.print;

public class mainAuto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        print("Створити двовимірний масив, величина якого вираховується рандомно. \n" +
                "Заповнити даний масив обєктами авто, всі значення конструктора якого заповнюються рандомно ? \n" +
                " Так ?\n" +
                " Ні ?");

        String question = scanner.nextLine();

        if(question.equalsIgnoreCase("Так")){
            Auto[][] auto = new Auto[random(1, 4)][random(1, 4)];


            for (int i = 0; i < auto.length; i++) {
                for (int j = 0; j < auto[i].length; j++) {
                    auto[i][j] = new Auto(count++,random(100, 200),
                            random(1980, 2020),
                            new Engine(random(2,12)),
                            new Helm(random(35,44),randomMaterial()));
                }
            }
            print("1 : Вивести toString() даних елементів масиву на консоль. ( deepToString() )");
//            print("2 : Для всіх обєктів даного масиву засетати одне значення будьякого поля класу Авто (fill()) ");
            print("2 : відсортувати за спаданням всі обєкти за полем : Number Of Horse Power ");
            print("3 : відсортувати за зростанням  всі обєкти за полем : Number Of Horse Power ");
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println( Arrays.deepToString(auto));
                    break;
                }

//                case 2: {
//                    for(Auto[] autos : auto){
//                        Arrays.fill(autos,new Auto(10,9, new Engine(8),
//                                new Helm(7,randomMaterial())));
//                        print(Arrays.deepToString(autos));
//                    }
//                break;
//                }
                case 2:{
                    for (Auto[] m : auto){
                        print();
                        Arrays.sort(m);
                        print(Arrays.deepToString(m));
                    }
                    break;
                }
                case 3:{
                    for (Auto[] m : auto){
                        Arrays.sort(m, Comparator.reverseOrder());
                        print(Arrays.deepToString(m));
                    }
                    break;
                }
                default: {
                    print("Веденно невірне значення !");
                    break;
                }

            }
        }else if(question.equalsIgnoreCase("Ні")){
            print("Бувай !");
            System.exit(0);
        }else {
            print(" Веденно невірне значення ! ");
            System.exit(0);
        }

    }
    static int random(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Мінімальне значення повинно бути менше максимального значення!");
        }

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    static String randomMaterial(){
        Random random = new Random();
        int i = random.nextInt(2)+1;
        String s = null;
        if(i == 1){
            s = "Alcantara";
        }else if(i==2){
            s = "leather";
        }
        return s;
    }
}
