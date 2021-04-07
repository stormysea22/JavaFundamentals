import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;

public class javaAlgos {
    public static <x> ArrayList<x> singleArray(ArrayList<x> dupList) {
        ArrayList<x> result = new ArrayList<x>();

        for (x element : dupList) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        ArrayList<Object> dupList = new ArrayList<>(Arrays.asList(1, "string", 1, 1, 1));
        System.out.println(dupList);
        ArrayList<Object> noDup = singleArray(dupList);
        System.out.println(noDup);
    }
}