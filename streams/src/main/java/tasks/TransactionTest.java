package tasks;

import java.util.Comparator;
import java.util.Optional;

public class TransactionTest {
    public static void main(String[] args) {

        //1- Find all transaction in 2011 and sort by value
        //Comparator<Transaction> comparator = Comparator.comparing(Transaction::getValue);
        TransactionData.getAll().stream()
                .filter(p->p.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2. What are all the unique cities where the traders work
        System.out.println("************Task2************");
        TransactionData.getAll().stream().
                map(transaction -> transaction.getTrader().getCity()).
                distinct()
                .forEach(System.out::println);

        //3- Find all traders from Cambridge and sort them by name
        System.out.println("************Task3************");
        TransactionData.getAll().stream().filter(p->p.getTrader().getCity().
                equals("Cambridge")).distinct().
                sorted(Comparator.comparing(p->p.getTrader().
                        getName()
        )).forEach(System.out::println);

        //4- Return a string of all trader's names sorted alphabetically
        System.out.println("************Task4************");
        String result = TransactionData.getAll().stream()
                .map(name -> name.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(a, b) -> a + ", " + b);

        //5- Are any traders based in Milan
        System.out.println("************Task5************");
        boolean milanBased = TransactionData.getAll().
                stream().anyMatch(t->t.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);

        //6- Print the values of all transactions from the traders living in Cambridge
        System.out.println("************Task6************");

        TransactionData.getAll().stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7- What is the highest value of all the transactions
        System.out.println("************Task7************");
        int value = TransactionData.getAll().stream().
                map(Transaction::getValue).
                reduce(0,Integer::max);
        System.out.println("value = " + value);

        //7- Find the transaction with the smallest value
        System.out.println("************Task7************");
        Optional<Transaction> smlValue =  TransactionData.getAll()
                .stream().reduce((t1,t2)-> t1.getValue()<t2.getValue()?t1:t2);
        System.out.println(smlValue.get());

        Optional<Transaction> smallestValue = TransactionData.getAll().stream().min(Comparator.comparing(Transaction::getValue));
        System.out.println(smallestValue.get());



    }
}
