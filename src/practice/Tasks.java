package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
      String str = "Java";
        stringReverse3(str);
    }
    public static String stringReverse(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result+=str.substring(i,i+1);
        }
        return result;
    }

    public static String stringReverse2(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.substring(i,i+1)+result;
        }
        return result;
    }

    public static void stringReverse3(String str){
        List<String> lst = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(lst);
        for (String s : lst) {
            System.out.print(s);
        }
    }

}
