
import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double hypo = (legA) ^ 2 + (legB) ^ 2;
        double squareRoot = Math.sqrt(hypo);
        return squareRoot;

    }
}