import javax.swing.*;
import java.security.PublicKey;

public class Rational {
    int Numerator;
    int Denominator;

    public Rational(int x, int y) {
//        if (y == 0) {
//            System.out.printf("Incorrect Denominator");
//        }
        Numerator = x;
        Denominator = y;
    }

    public Rational() {
        Numerator = 1;
        Denominator = 1;
    }

    @Override
    public String toString() {
        return  Numerator +"/"+ Denominator;
    }
}
