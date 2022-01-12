import java.lang.System; //redundant
import java.lang.*;     //redundant
import java.util.Random; // if line 3 is present line 4 would be redundant 
import java.util.*;  //redundant

public class ImportExample{
    public static void main(String[] args){
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

// 4 imports are redundant