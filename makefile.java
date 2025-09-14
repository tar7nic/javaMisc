import java.io.File;
import java.io.FileNotFoundException;

public class makefile {
    public static void main(String[] args){
        java.io.File file = new java.io.File("jendu.txt");
        try{
            if(file.exists()){
            System.out.println("File already exists.");     
            } else {
            java.io.PrintWriter writer = new java.io.PrintWriter(file);
            writer.println("Janhavi forgot roomkeys 002.");
            writer.close();
            }       
        } catch (FileNotFoundException e) {
            System.exit(0);
        }
    }    
}
