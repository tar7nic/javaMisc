package myPackage;

public class TestmyMath {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = myMath.max(i, j);
        int l = 7;
        System.out.println("The max bw " + i + " and " + j + " is " + k);
        System.out.println("The addition of: " + i + " and "+ j + " is " + myMath.add(j, k));
        System.out.println("The addition of: " + i + " and "+ j + " and "+ k + " is " + myMath.add(j, k, l));
        System.out.println("Subtraction = " + myMath.sub(10, 5));
        System.out.println("Multiplication = " + myMath.mul(10, 5));
    }
}
