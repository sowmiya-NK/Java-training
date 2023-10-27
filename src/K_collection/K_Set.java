package K_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class K_Set {
    public static void main(String[] args) {
        HashSet<Integer> students = new HashSet<>();
        Integer one = 1;
        students.add(2);
        students.add(one);
        students.add(one);
        students.add(3);


        System.out.println("---for loop---");
        for (Integer student : students) {
            System.out.println(student);//remove duplicate,give asscending order
        }

    }


}

