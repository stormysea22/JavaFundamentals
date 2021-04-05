public class StringManipulatorTest {
    public static void main(String args[]) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("   Hello   ", "World    ");
        System.out.println(str);

        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello world", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        String word = "Hello";
        String subword = "llo";
        String subword2 = "world";
        Integer a1 = manipulator.getIndexOrNull(word, subword);
        Integer b1 = manipulator.getIndexOrNull(word, subword2);
        System.out.println(a1);
        System.out.println(b1);

        String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2);
    }
}
