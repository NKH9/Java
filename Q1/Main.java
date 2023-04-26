import java.util.concurrent.Flow;

public class Main {
    public void pr(Rational obj){
        System.out.printf(obj.Numerator+"/"+obj.Denominator);
    }
    public static Rational add(Rational obj1, Rational obj2)  {
        Rational obj3= new Rational();
        obj3.Denominator =obj1.Denominator*obj2.Denominator;
        obj3.Numerator = obj1.Numerator*obj2.Denominator+obj2.Numerator*obj1.Denominator;
        return obj3;
    }
    public static Rational multiply(Rational obj1, Rational obj2)  {
        Rational obj3= new Rational();
        obj3.Denominator =obj1.Denominator*obj2.Denominator;
        obj3.Numerator = obj1.Numerator*obj2.Numerator;
        return obj3;
    }
    public static Rational substract(Rational obj1, Rational obj2)  {
        Rational obj3= new Rational();
        obj3.Denominator =obj1.Denominator*obj2.Denominator;
        obj3.Numerator = obj1.Numerator*obj2.Denominator-obj2.Numerator*obj1.Denominator;
        return obj3;
    }
    public static Rational divide(Rational obj1, Rational obj2)  {
        Rational obj3= new Rational();
        obj3.Denominator =obj1.Denominator*obj2.Numerator;
        obj3.Numerator = obj1.Numerator*obj2.Denominator;
        return obj3;
    }
    public static void Printout(Rational obj) {
        System.out.println(obj.toString());
    }
    public static float ToFloat(Rational obj) {
        float a = obj.Numerator;
        float b = obj.Denominator;
        return a/b;
    }

    public static void main(String[] args) {
        Rational obj1 = new Rational(1, 5);
        Rational obj2 = new Rational(2, 3);
        Rational answerAdd = add(obj1, obj2);
        System.out.println(answerAdd.toString()+" in floating-point format: "+ ToFloat(answerAdd));
        Rational multiply = multiply(obj1, obj2);
        System.out.println(multiply.toString()+" in floating-point format: "+ToFloat(multiply));
        Rational Subtract = substract(obj1, obj2);
        System.out.println(Subtract.toString()+" in floating-point format: "+ToFloat(Subtract));
        Rational div = divide(obj1, obj2);
        System.out.println(div.toString()+" in floating-point format: "+ToFloat(div));

    }



}


