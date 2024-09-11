import java.util.Scanner;

public class TestRational {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter num");
        int num = myObj.nextLine();
        System.out.println("Enter denom");
        int denom = myObj.nextLine();
        Rational frac = new Rational(num,denom);
        System.out.println(frac);
    }
}
