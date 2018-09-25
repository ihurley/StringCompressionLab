/**
 * Name: Izzy Hurley
 * Lab Name: StringCompression
 * Lab Purpose: The goal of StringCompression is to create a program
 * Date: 9/23/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class StringCompression {

    public static String disemvowel (String s){
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) =='a'||s.charAt(i) =='A'||
             s.charAt(i) =='e'||s.charAt(i) =='E'||
           s.charAt(i) =='i'||s.charAt(i) =='I'||
          s.charAt(i) =='o'||s.charAt(i) =='O'||
         s.charAt(i) =='u'||s.charAt(i) =='U'){
              s =  s.substring(0,i)+s.substring(i+1,s.length());
            }
        }
        return s;
    }

    public static String simpleCompress(String s){
        String n = "";
        for (int i =0; i<s.length();){
            int counter =0;
            char current = s.charAt(i);
            while (i<s.length() &&s.charAt(i)== current){
             counter++;
             i++;

            }

            n += current;
            if (counter>1){n+=counter;}
            else {i++;}
           
        }
return n;
    }
}
