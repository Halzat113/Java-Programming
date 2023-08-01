package collectionsReview;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        //Create Arraylist and a class
        List<Student> students = new ArrayList<>();
        //Add Elements to ArrayList
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));

        //Iteration on ArrayList
        // for loop
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("===========================");
        //2.Iterator
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //backward iteration
        System.out.println("=============backward==============");
        while (((ListIterator<Student>) iterator).hasPrevious()){
            System.out.println(((ListIterator<Student>) iterator).previous());
        }

        System.out.println("==============");

        //3. for each loop
        for (Student student:students){
            System.out.println(student);
        }
        System.out.println("===================");
        //4.Lambda
        students.forEach(System.out::println);

        //sorting elements in list
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);
    }

    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2){
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
