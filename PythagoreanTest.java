
public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean result = new Pythagorean(); // Calls back on Pythagorean.java
        double output = result.calculateHypotenuse(3, 4); // Subs in for legA and legB
        System.out.println(output);
    }
}