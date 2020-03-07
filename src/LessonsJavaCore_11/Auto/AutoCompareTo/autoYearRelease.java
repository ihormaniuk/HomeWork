package LessonsJavaCore_11.Auto.AutoCompareTo;

import LessonsJavaCore_11.Auto.Auto;

import java.util.Comparator;

public class autoYearRelease implements Comparator <Auto> {
    @Override
    public int compare(Auto auto ,Auto auto1){
        if(auto.getYearRelease() == auto1.getYearRelease()){
            return 0;
        }
        else if(auto.getYearRelease() < auto1.getYearRelease()){
            return -1;
        }else {
            return 1;
        }
    }
}
