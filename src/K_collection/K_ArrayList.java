package K_collection;

import java.util.ArrayList;

public class K_ArrayList {


    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();//obj creation
        arrayList.add(new Student(1, "sowmiiiii"));
        arrayList.add(new Student(2, "anand"));
        arrayList.add(new Student(3, "anu"));//set that value
        System.out.println(arrayList.get(2).getName());//get index value
        arrayList.remove(2);//remove that element

        //getting name using for loop
        System.out.println("----using arraylist------");
        for (Student student : arrayList) {
            System.out.println(student.getName());
        }

        //using constructor pass that value
        Student std = new Student(10, "Harini");
        arrayList.add(std);
        System.out.println("-----using constructor----");
        for (Student student : arrayList) {
            System.out.println(student.getName());
        }


    }
}
