import java.io.File;
import java.io.FileNotFoundException;

public class createfile {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("new.txt");
        try {
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                java.io.PrintWriter writer = new java.io.PrintWriter(file);
                writer.println("Tanya Mahesh Nichwani 24");
                writer.println("Reshma Mahesh Nichwani 47");
                writer.close();
            }
        } catch (FileNotFoundException e) {
            System.exit(0);
        }
    }
}
