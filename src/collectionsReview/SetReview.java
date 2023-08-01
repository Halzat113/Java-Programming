package collectionsReview;

import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
        Set<Student> myset = new HashSet<>();

        myset.add(new Student(7,"Halzat"));
        myset.add(new Student(8,"Ahmet"));
        myset.add(new Student(9,"Mohammad"));
        myset.add(new Student(9,"Mohammad"));
        System.out.println(myset);

        System.out.println("===============");

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        numSet.add(2);
        System.out.println(numSet.add(2));

        System.out.println(findFirstRepeatingChar("Java Developer"));

        System.out.println("=============");
        System.out.println(myset);


    }
    static Character findFirstRepeatingChar(String str){
       Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if(!set.add(c)){
                return c;
            }
        }
        return null;
    }
}
