//Two possible answers
import java.nio.file.*;
// or
import java.nio.file.Files;
import java.nio.file.Paths;

// This don't work
//import java.nio.* ;  // Wildcard only matches class names, not "file.file" Yout don't go to the childs!
//import java.nio.*.*;  //You can only have one wildcard! The wildcard must be @ the end! https://youtu.be/VScSEXRwUqQ
//import java.nio.file.Paths.* // You cannnot import methods only class names

public class InputImports{
    public static void main(String[] args){
        System.out.println("It should worked with that.");
    }
    public void read(Files files){
        Paths.get("name");
    }
}