public class FizzBuzzTest {

    public static void main(String args[]) {

        FizzBuzz fB = new FizzBuzz();
        String output = fB.fizzBuzz(3);
        System.out.println(output);
        output = fB.fizzBuzz(5);
        System.out.println(output);
        output = fB.fizzBuzz(30);
        System.out.println(output);
        output = fB.fizzBuzz(7);
        System.out.println(output);
    }
}