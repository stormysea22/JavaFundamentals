import java.util.*;

public class Basics {

    public static void main(String[] args) {
        for (int i = 1; i <= 256; i++) {
            System.out.println(i);
        }
    }

    // public static void main(String[] args) {
    //     for (int i = 1; i <= 256; i++) {
    //         if (i % 2 == 1) {
    //             System.out.println(i);
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     int sum = 0;
    //     for (int i = 1; i <= 256; i++) {
    //         System.out.println(sum += i);
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] arr = { 1, 3, 5, 7, 9, 13 };
    //     for (int num : arr) {
    //         System.out.println(num);
    //     }
    // }

    // public static void main(String[] args) {
    //     Integer[] num = { 1, 3, 5, 7, 9 };
    //     int max = Collections.max(Arrays.asList(num));
    //     int min = Collections.min(Arrays.asList(num));
    //     System.out.println("this is the max: " + max);
    //     System.out.println("This is the min: " + min);
    // }

    // public static void main(String[] args) {
    //     int[] arr = { 1, 3, 5, 7, 9 };
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //     }
    //     System.out.println(sum / arr.length);
    // }

    // public static void main(String[] args) {
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     for (int i = 1; i <= 255; i++) {
    //         if (i % 2 == 1) {
    //             arr.add(i);
    //         }
    //     }
    //     System.out.println(arr);
    // }

    // public static void main(String[] args) {
    //     int[] arr = { 1, 3, 5, 7, 9 };
    //     int y = 7;
    //     int count = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > y) {
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // }

    //     static int[] get() {
    //     return new int[] { 1, 5, 10, -2, -12 };
    // }

    
    // public static void main(String[] args) {
    //     int[] myArr = { 1, 3, 5, 7 };
    //     int[] newArr = new int[myArr.length];
    //     int square;
    //     for (int i = 0; i < myArr.length; i++) {
    //         square = myArr[i] * myArr[i];
    //         newArr[i] = square;
    //     }
    //     System.out.println(Arrays.toString(newArr));
    // }
    
    
    // public static void main(String[] args) {
    //     int[] arr = get();
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] < 0) {
    //             arr[i] = 0;
    //         }
    //         System.out.print(arr[i] + ",");
    //     }
    // }

    //     public static void main(String[] args) {
    //     Integer[] arr = { 1, 3, 5, 7, 9 };
    //     int max = Collections.max(Arrays.asList(arr));
    //     int min = Collections.min(Arrays.asList(arr));
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //     }
    //     System.out.println("This is the avg: " + sum / arr.length);
    //     System.out.println("this is the max: " + max);
    //     System.out.println("This is the min: " + min);
    // }

    // static int[] get() {
    //     return new int[] { 1, 5, 10, 7, -2 };
    // }

    // public static void main(String[] args) {
    //     ArrayList<Integer> newArr = new ArrayList<>();
    //     int[] arr = get();
    //     for (int i = 0; i < arr.length; i++) {
    //         if (i == arr.length - 1) {
    //             newArr.add(0);
    //         } else {
    //             newArr.add(arr[i + 1]);
    //         }
    //     }
    //     System.out.println(newArr + ",");
    // }

}
