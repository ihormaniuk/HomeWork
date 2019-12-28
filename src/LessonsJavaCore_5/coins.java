package LessonsJavaCore_5;

import java.util.Random;

public class coins {
    public static void main(String[] args){
        Random random = new Random (  );
        int num = random.nextInt(9) + 5;
        System.out.println ("Кидаю монету " +  num + " Метер" );
    }
}
