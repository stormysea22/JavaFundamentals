import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Puzzling {

    // public void greaterThanTen(int[] arr) {
    //     ArrayList<Integer> newArr = new ArrayList<Integer>();
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //         if (arr[i] > 10) {
    //             newArr.add(arr[i]);
    //         }
    //     }
    //     System.out.println(sum);
    //     System.out.println(newArr);
    // }

    // public void stringGreaterThan5(String[] arr) {
    //     ArrayList<String> newArr = new ArrayList<String>();
    //     ArrayList<String> newArrFive = new ArrayList<String>();
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i].length() > 5) {
    //             newArrFive.add(arr[i]);
    //         }
    //         newArr.add(arr[i]);
    //     }
    //     Collections.shuffle(newArr);
    //     System.out.println(newArr);
    //     System.out.println(newArrFive);
    // }

    // public void alphaArr() {
    //     ArrayList<String> alphaArr = new ArrayList<String>();

    //     for(char alpha = 'A'; alpha <= 'Z'; alpha++) {
    //         alphaArr.add(Character.toString(alpha));
    //     }
    //     System.out.println(alphaArr);
    //     Collections.shuffle(alphaArr);
    //     System.out.println(alphaArr);
    // }

    // public void randomNum() {
    //     ArrayList<Integer> randNums = new ArrayList<Integer>();

    //     for (int i = 0; i <= 10; i++) {
    //         int num = ThreadLocalRandom.current().nextInt(55, 100);
    //         randNums.add(num);

    //     }
    //     System.out.println(randNums);
    // }

    // public void randomString() {
    //     Random rand = new Random();
    //     StringBuilder randstr = new StringBuilder();
    //     String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    //     for (int i = 0; i < 5; i++) {
    //         randstr.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
    //     }
    //     String finalStr = randstr.toString();
    //     System.out.println(finalStr);
    //     }
    
    public void randomString2() {
        Random rand = new Random();
        StringBuilder randStr = new StringBuilder();
        ArrayList<String> randlist = new ArrayList<String>();

        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                randStr.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
            }
            String finalStr = randStr.toString();
            randlist.add(finalStr);
            randStr.setLength(0);
        }
            System.out.println(randlist);
        
    }
        

}
