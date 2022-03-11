package Tomas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Tom");
        mySet.add("Murphy");
        mySet.add("Patrick");

        System.out.println(mySet);
        if(!mySet.isEmpty()){
        Iterator<String> myIter = mySet.iterator();
        while(myIter.hasNext()){
            System.out.println(myIter.next());
        }

        if (mySet.contains("Patrick")){
            mySet.remove("Patrick");
        }
            System.out.println(mySet);
        }

        HashSet<String> nSet= new HashSet<>();
        nSet.addAll(mySet);
        System.out.println("nSet: " + nSet);

        HashSet<String> twoSet = (HashSet)mySet.clone();
        System.out.println(twoSet);

        HashSet<String> threeSet = new HashSet<>(twoSet);
        System.out.println("three " + threeSet);

        Book book1 = new Book("Fly", "Tom", 1);
        Book book2 = new Book("Run", "Smiley", 2);

        HashMap<Integer,Book> bookHash = new HashMap<>();
        bookHash.put(1, book1);
        bookHash.put(2, book2);
        for(HashMap.Entry<Integer,Book> bookEntry : bookHash.entrySet()){
            Book b = bookEntry.getValue();
            System.out.println("Book Number: " + bookEntry.getKey() + ", book name: " + b.name + " book author: " +
                    b.author + " book id: " + b.id);
        }

        HashSet<Cars> setCar = new HashSet<>();
        Cars car1 = new Cars("Ferrari", 538);
        Cars car2 = new Cars("Porsche", 538);
        setCar.add(car1);
        setCar.add(car2);
        setCar.add(car1);

        Iterator<Cars> myItty = setCar.iterator();
        while(myItty.hasNext()){
            Cars c = myItty.next();
            System.out.println(c.name + " : " + c.horsePower);
        }

        for(Cars c : setCar){
            System.out.println(c.name + " : " + c.horsePower);
        }


    }
}

class Book{
    String name, author;
    int id;

    public Book(String name, String author, int id){
        this.name = name;
        this.author = author;
        this.id = id;
    }
}

class Cars{
    String name;
    int horsePower;
    public Cars(String name, int horsePower){
        this.name = name;
        this.horsePower = horsePower;
    }

}