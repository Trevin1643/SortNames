/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortnames;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author tmiller
 */
public class SortNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader("BoyNames.txt")))
        {
          
          for(int i =0; i < 200; i++)
          {
              arrayList.add(br.readLine());
          }
          Collections.sort(arrayList);
          
          
          for(int i = 0; i <= arrayList.size()-1 ; i++)
          {
            System.out.println(arrayList.get(i)); 
          }
  
        }
        
        catch(Exception e)
        {
            
        }
        
        //Path p = Paths.get("SortNames.txt");
        //Path p2 = Paths.get("SortedBoyNames.txt");
        //Path p3 = p.resolve(p2);
        //System.out.println("The contents of p3 : " + p3.toString());
        
        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("SortedBoyNames.txt"))))
        {
         
          for(int i = 0; i <= arrayList.size()-1 ; i++)
          {
            writer.println(arrayList.get(i));
            
          }
          
                  
          
        }
        
        catch(Exception e)
        {
            
        }
    }
    
}
