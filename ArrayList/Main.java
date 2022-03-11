package Tomas;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> myArrL = new ArrayList<>();
        myArrL.add("Tomas");
        myArrL.add("Gunther");
        myArrL.add("Lucy");
        System.out.println(myArrL);
        myArrL.set(0, "Michelle");
        System.out.println(myArrL);
        myArrL.remove("Lucy");
        System.out.println(myArrL);
        for (int i = 0; i < myArrL.size(); i++){
            System.out.println(myArrL.get(i));
        }
        System.out.println("Foreach:");
        for (String name: myArrL){
            System.out.println(name);
        }
        System.out.println("Iterator");
        myArrL.remove(0);
        Iterator<String> myItty = myArrL.iterator();
        while(myItty.hasNext()){
            System.out.println(myItty.next());
        }
        ArrayList<Student> stuArrL = new ArrayList<>();
        Student stu1 = new Student("Tom", 6488587);
        Student stu2 = new Student("Kate", 98354543);
        stuArrL.add(stu1);
        stuArrL.add(stu2);
        Iterator<Student> stuIter = stuArrL.iterator();
        while(stuIter.hasNext()){
            Student s = stuIter.next();
            System.out.println("The name is: " + s.name + ", and the student number is: " + s.stuNum);

        }
    }
}
class Student {
    String name;
    int stuNum;

    public Student(String name, int stuNum){
        this.name = name;
        this.stuNum = stuNum;
    }


}