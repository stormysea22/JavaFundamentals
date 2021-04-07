import java.util.*;
import java.lang.ClassCastException;

public class listOfExceptions {

    static ArrayList<Object> myList = new ArrayList<Object>();

    public static void main(String[] args) {
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                int castedValue = (Integer) myList.get(i);
            }
            catch(ClassCastException exception){
                exception.printStackTrace();
                System.out.println("Exception was caught: " + myList.get(i));
            }
        }
    }
}