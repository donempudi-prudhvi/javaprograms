import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        print("Enter a string to reverse");
        
        char[] word = s.nextLine().toCharArray();
        int lef = 0;
        int rig = word.length-1;

        while (true) { 
  
            char lefchar = word[lef];
            word[lef] = word[rig];
            word[rig] = lefchar;
            
            if(lef == rig)
            break;

            lef++;
            rig--;

            if(lef>rig)
            break;
        }
        
        print("Reversed String is : "+ String.valueOf(word));
        //print("Reversed String is : "+ String.copyValueOf(word));
        /*
           StringBuilder sb = new StringBuilder();
         * for(char c:word){
         *      sb.append(c);
         * }
         * print("Reversed String is : "+ sb.toString());
         */
    }

    public static void print(String s){
        System.out.println(s);
    }
    
}
