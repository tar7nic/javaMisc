import java.util.*;
import java.io.*;
public class FileClassEx {
    public static void main(String[] args) {
        java.io.File file1 = new File("vit.txt");
        java.io.File file2 = new File("C:\\Users\\Asus\\OneDrive\\Documents\\VSC\\output\\.vscode\\JavaClass\\vit.txt");
        System.out.println("Does file1 exist? " + file1.exists());
        System.out.println("Does file2 exist? " + file2.exists());
        
        System.out.println("Is file1 readable? " + file1.canRead());
        System.out.println("Is file2 readable? " + file2.canRead());
        
        System.out.println("Is file1 writable? " + file1.canWrite());
        System.out.println("Is file1 writable? " + file2.canWrite());
        
        System.out.println("Is file1 executable? " + file1.canExecute());
        System.out.println("Is file2 executable? " + file2.canExecute());

        System.out.println("Does file1 have absolute path? " + file1.isAbsolute());
        System.out.println("Does file2 have absolute path? " + file2.isAbsolute());

        System.out.println("What is the size of file1? " + file1.length());
        System.out.println("What is the size of file2? " + file2.length());
        
        System.out.println("Is file1 a directory? " + file1.isDirectory());
        System.out.println("Is file2 a directory? " + file2.isDirectory());

        System.out.println("Is file1 a file? " + file1.isFile());
        System.out.println("Is file2 a file? " + file2.isFile());
    }
}
