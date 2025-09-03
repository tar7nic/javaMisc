import java.io.File;
import java.io.FileNotFoundException;

public class Q1 {
    public static void main(String[] args){

        java.io.File file = new java.io.File("ai.txt");
    try{
        if(file.exists()){ 
            System.out.println("File already exists.");
        }

        else{
        java.io.PrintWriter writer = new java.io.PrintWriter(file);
        writer.println("Tarun Mahesh Nichwani 19");
        writer.close();
        }
    }
    catch(FileNotFoundException e){
        System.exit(0);
        }
    }
}
