package tasks;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {

        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[1]+t[0]}).limit(10).forEach(t-> System.out.println("("+t[0]+","+t[1]+")"));
        System.out.println("=====================");
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[1]+t[0]}).map(p->p[0]).limit(10).forEach(System.out::println);

    }
}
