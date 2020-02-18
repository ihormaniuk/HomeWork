package LessonsJavaCore_5;

import java.util.Random;

import static MyClassesToWork.Print.print;

public class coins {
    public static void main(String[] args){
        Random random = new Random (  );
        int num = random.nextInt(4) ;
        print ("Кидаю монету на висоту : " +  num + " Метерів" );
    }
}
