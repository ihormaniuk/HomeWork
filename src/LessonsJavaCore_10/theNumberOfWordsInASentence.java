package LessonsJavaCore_10;

import java.util.Scanner;

import static MyClassesToWork.Print.print;

public class theNumberOfWordsInASentence {

    public static void main(String[] args){

        Scanner scanner = new Scanner ( System.in );

        print ("Ведіть речення для підрахунку слів через пробіл");

        String sentence = scanner.nextLine ();
        String [] sentenceMass;
        String a = " " ;
        sentenceMass = sentence.split ( a );

        print(sentenceMass.length);

    }

}
