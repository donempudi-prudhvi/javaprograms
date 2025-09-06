import java.util.*;
import java.time.Instant;
import java.time.LocalTime;

public class FindPairsTimeComplexity {

    public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    
    print("Enter the size of Array");
    int sizeOfArrray = s.nextInt();
    if(sizeOfArrray<2){
        print("The array must atleast have 2 elements, please enter the size of array  > 2");
        sizeOfArrray = s.nextInt();
    }
    int[] array = new int[sizeOfArrray];
    
    print("Enter Elements One by One in ascending order");
    for(int i=0;i<sizeOfArrray;i++){
        print("Enter the element");
         array[i] = s.nextInt();
    }
    print("Enter the anticipated sum");
    int x = s.nextInt();

    int left = 0;
    int right = sizeOfArrray-1;

    Instant now = Instant.now();
    long currentTime = now.getEpochSecond();
    //print(String.valueOf(currentTime));
        while(true){
          if(left == right){
             print(String.valueOf("No pair found"));
             break;
          }else {
             int sum = array[left]+array[right];
             if(sum == x){
                 print(String.valueOf("Two elements are : " + array[left] + " and " + array[right]));
                 break;
             }else if(sum > x){
                 right--;
             }else if(sum<x){
                 left++;
             }
          }
        }
    //print(String.valueOf(now.getEpochSecond()));
    print("Time taken in Two Pointers : " + String.valueOf(now.getEpochSecond()-currentTime));

    currentTime = now.getEpochSecond();
    //print(String.valueOf(currentTime));
    for(int i=0;i<sizeOfArrray;i++){
        boolean done = false;
        for(int j=i+1;j<sizeOfArrray;j++){
            int sum = array[i]+array[j];
            if(sum == x){
                print(String.valueOf("Two elements are : " + array[left] + " and " + array[right]));
                done = true;
                break;
            }
        }
        if(done)
        break;
    }
    //print(String.valueOf(now.getEpochSecond()));
    print("Time taken in Bruteforce : " + String.valueOf(now.getEpochSecond()-currentTime));
    



}

    public static void print(String s){
        System.out.println(s);
    }
    
    
}


