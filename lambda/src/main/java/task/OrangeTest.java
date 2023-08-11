package task;

import behaviourParameterization.Balls;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> orangeList = List.of(new Orange(300,Color.GREEN),
                Orange.builder().weight(200).color(Color.GREEN).build(),
                Orange.builder().weight(100).color(Color.RED).build(),
                Orange.builder().weight(500).color(Color.RED).build(),
                Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter = (Orange orange)-> "An orange of "+orange.getWeight()+"g";
        prettyFormatter(orangeList,simpleFormatter);

        prettyFormatter(orangeList,orange -> "An orange of "+orange.getWeight()+"g");

        System.out.println("=====================");
        OrangeFormatter fancyFormatter = orange -> {
            String result = orange.getWeight()>200?"Heavy":"Light";
            return "A "+result + " "+ orange.getColor() + " orange";
        };

        prettyFormatter(orangeList,fancyFormatter);

        prettyFormatter(orangeList,orange -> {String result = orange.getWeight()>200?"Heavy":"Light";
        return String.format("A %s %s apple",result,orange.getColor());});

        System.out.println("====================with functional interface==================");
        Consumer<List<Orange>> f1 = p-> {
            for (Orange orange : p) {
                System.out.println("An orange of "+orange.getWeight()+"g");
            }
        };
        f1.accept(orangeList);
    }

   private static void prettyFormatter(List<Orange> inventory,OrangeFormatter formatter){
       for (Orange orange : inventory) {
           String output = formatter.accept(orange);{
               System.out.println(output);
           }
       }
   }
}
