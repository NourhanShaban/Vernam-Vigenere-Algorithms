
package vernamcipher;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import javax.swing.JOptionPane;



 

 

public class Vernam_VigenereCipher {
 
 
    public static void main(String[] args) {
          String Alpha=new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    Scanner s1=new Scanner(System.in);
    String key=s1.next();
    String key1=key;
    String plain=s1.next();
    String t="";
    int res1=0;
   StringBuilder cipher=new StringBuilder();
   StringBuilder cipher2=new StringBuilder();
    if(key.length()<plain.length())
    {
       int y=plain.length()-key.length();
       String s=key.substring(0, y);
       key=key.concat(s);
    }
      for(int i=0;i<plain.length();i++)
      {
         int res=(Alpha.indexOf(plain.charAt(i))+Alpha.indexOf(key.charAt(i)))%26;
         cipher.append(Alpha.charAt(res));
         res1=(int)plain.charAt(i)^key.charAt(i);
          t= String.format("%02X",res1 );
       //  String hex = Integer.toHexString();
        
             cipher2.append(t);

      }
     System.out.println("Vigenere: "+cipher);
        System.out.println("Vernam: "+cipher2);
   if(key1.length()<plain.length())
    {
        System.out.println("One-Time Pad: "+"NO");
    }
   else
            System.out.println("One-Time Pad: "+"YES");
    
    }
    
}