package lesson05.learn_collections;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

       ArrayList myArrayList1;
       myArrayList1 = WorkWithArrayList.createArrayList(5, 2);
        WorkWithArrayList.deleteStringFromArray(myArrayList1, 1);
        WorkWithArrayList.checkIfElementWasDeleted(myArrayList1,"");
    }


}
