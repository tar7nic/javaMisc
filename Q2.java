import java.io.File;
import java.io.FileNotFoundException;

public class Q2 {
    public static void main(String[] args){

        java.io.File file = new java.io.File("Student.txt");
    try{
        if(file.exists()){ 
            System.out.println("File already exists.");
        }

        else{
        java.io.PrintWriter writer = new java.io.PrintWriter(file);
        writer.println("Alice M Johnson 90");
        // writer.println(90+"\n");
        writer.println("Bob P Smith 90");
        // writer.println(90);
        writer.close();
        }
    }
    catch(FileNotFoundException e){
        System.exit(0);
        }
    }
}
