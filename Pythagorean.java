
import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        return Math.sqrt(legA * legA + legB * legB);

    }


    public static void main(String[] args) {
        Pythagorean pythagorean = new Pythagorean();
        System.out.println(pythagorean.calculateHypotenuse(3, 4));
    }
}