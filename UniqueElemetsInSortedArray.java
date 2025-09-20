import java.util.*;

public class UniqueElemetsInSortedArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        print("Enter the size of array");
        int size = s.nextInt();
        int[] array = new int[size];
        print("Enter elements in sorted order: \n");
        for(int i=0;i<size;i++){
            array[i] = s.nextInt();
        }

        /* // the below can be ignored
        if (size==1) {
            print("1 unique element present in the given array");
            return;
        }
        if(size == 2){
            if(array[0]==array[1]){
            print("1 unique element present in the given array");
            return;
            }
            else{
            print("2 unique elements present in the given array");
            return;
            }
        } the above can be ignored */
        int slow = 0;
        int fast  = 1;
        
        while(fast < size){
            if(array[slow] != array[fast]){
                slow++;
                array[slow] = array[fast];
            }else{
                fast++;
            }
        }
        print(slow+1 + " unique elements present in the given array");

        
    }
    public static void print(String s){
        System.out.println(s);
    }
    
}
