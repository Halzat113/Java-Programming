package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Calculate s1 = (x,y)->Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(10,35);

        //Reference to instance method
        Calculate m1 = (x,y)-> new Calculator().findMultiply(x,y);
        m1.calculate(5,6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(5,6);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(3,5);

        BiFunction<String,Integer,String> fn = (str,i)->str.substring(i);
        System.out.println(fn.apply("Developer",6));

        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer", 6));

        Consumer<Integer> display = i-> System.out.println(i);
        display.accept(4);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(4);

        BiFunction<MyClass,Integer,Double> v2 = MyClass::method;
        System.out.println(v2.apply(new MyClass(), 4));

        BiFunction<String,String,String> v3 = String::concat;
        System.out.println(v3.apply("abc","def"));

    }
}
