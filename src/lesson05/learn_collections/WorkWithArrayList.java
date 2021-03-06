package lesson05.learn_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class WorkWithArrayList {


    public static ArrayList createArrayList(int count, int length) {
        ArrayList myArrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            myArrayList.add(GenerateString.generateString(length));
        }
        System.out.println("My Array List was created" + myArrayList);
        return myArrayList;
    }

    public static void deleteStringFromArray(ArrayList myArrayList, int index) {
        if (index >= myArrayList.size()) {
            throw new IndexOutOfBoundsException("Element with this index does not exist");
        }
        String s = myArrayList.get(index).toString();
        System.out.println(myArrayList.get(index).toString() + " will de deleted");
        myArrayList.remove(index);
        checkIfElementWasDeleted(myArrayList, s);
        System.out.println(myArrayList);

    }

    public static boolean checkIfElementWasDeleted(ArrayList myArrayList, String s) {
        boolean result = !myArrayList.contains(s);
        System.out.printf("the string %s was deleted:  %s", s, result);
        System.out.println();
        return result;
    }

    public static void iterateArrayList(ArrayList myArrayList) {
        Iterator<String> myIterator = myArrayList.iterator();
        System.out.println("Iterating array with iterator");
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }

    public static void sortArrayList(ArrayList myArrayList) {
        System.out.println("Printing Array list before sorting: " + myArrayList);

        iterateArrayList(myArrayList);

        Comparator c2 = (o1, o2) -> {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        };


    }
}