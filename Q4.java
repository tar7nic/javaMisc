import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("Student.txt");
        try {
            java.util.Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                String firstname = sc.next();
                String middlename = sc.next();
                String lastname = sc.next();
                int grade = sc.nextInt();
                System.out.println(firstname + " " + middlename + " " + lastname + " " + grade);
           
            }
            sc.close(); 
        }
        catch (FileNotFoundException e) {
            System.exit(0);
        }
    }    
}
