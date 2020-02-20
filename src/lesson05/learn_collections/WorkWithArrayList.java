package lesson05.learn_collections;

import java.util.ArrayList;

public class WorkWithArrayList {
    public static ArrayList createArrayList(int count, int length) {
        ArrayList myArrayList = new ArrayList<>();
        for (int i = 0; i <= count; i++) {
            myArrayList.add(GenerateString.generateString(count, length));
        }
        System.out.println("My Array List" + myArrayList);
        return myArrayList;
    }

    public static void deleteStringFromArray(ArrayList myArrayList, int index) {
        if (index > myArrayList.size()) {
            throw new IndexOutOfBoundsException("Element with this index does not exist");
        }

        System.out.println(myArrayList.get(index).toString() + " will de deleted");
        myArrayList.remove(index);
    }
    public static boolean checkIfElementWasDeleted(ArrayList myArrayList, String s){
        boolean result = myArrayList.contains(s)  ;
        System.out.printf("the string %s was deleted: %s", s, result);
        return result;
    }

}
