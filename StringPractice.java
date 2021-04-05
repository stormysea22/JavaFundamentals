public class StringPractice {
    public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println("String Length is : " + length);
        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        String ninja2 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninja2);

        String ninja3 = "Welcome to Coding Dojo!";
        int a = ninja3.indexOf("Coding"); // a is 11
        int b = ninja3.indexOf("co"); // b is 3
        int c = ninja3.indexOf("pizza");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim());

        String a1 = new String("word");
        String b1 = new String("word");
        System.out.println(a1 == b1); // false. not the same exact object.
        System.out.println(a1.equals(b1));
    }
}
