package LessonsJavaCore_10;

import java.util.Scanner;

import static MyClassesToWork.Print.print;

public class loudletters {

    public static void main(String [] args){

        Scanner scanner = new Scanner ( System.in );

        print ("Заміна всіх голосних на  тире- ");

        String text = scanner.nextLine ();

        print(text.replaceAll ( "['А','О','У','Е','И','І','а',о','у','е','и','і']" ,"-" ));
    }

}
