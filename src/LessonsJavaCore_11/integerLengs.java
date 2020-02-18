package LessonsJavaCore_11;

import java.util.Arrays;
import java.util.Collections;

import static MyClassesToWork.Print.print;

public class integerLengs {
    public static void main(String[] args){
        Integer[] integers = {55,67,890,22,44,568,77,2,34,52,88,11};
        Arrays.sort(integers);
        print(Arrays.toString(integers));
        Arrays.sort(integers, Collections.reverseOrder());
        print(Arrays.toString(integers));
    }
}
