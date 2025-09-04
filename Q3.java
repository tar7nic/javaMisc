import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("ai.txt");
        try {
                java.util.Scanner sc = new Scanner(file);
                while(sc.hasNext()){
                    String firstname = sc.next();
                    String middlename = sc.next();
                    String lastname = sc.next();
                    int score = sc.nextInt();
                    System.out.println(firstname + " " + middlename + " " + lastname + " " + score);
                }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
            System.exit(0);
        }
    }
} 


