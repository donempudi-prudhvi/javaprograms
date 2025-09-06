

public class FindPairs{

    public static void main(String[] args){

        /*int[] numbers = null;
        numbers = new int[]{1,2,3,4,5};*/

        //int[] nums = new int[]{1,2,3,4};

        int[] nums = {1,2,3,4,5};

       int len = nums.length;

       int left = 0;
       int right = len-1;
       int x = 9;

       while(true){
         if(left == right){
            print(String.valueOf("No pair found"));
            break;
         }else {
            int sum = nums[left]+nums[right];
            if(sum == x){
                print(String.valueOf("Two elements are : " + nums[left] + " and " + nums[right]));
                break;
            }else if(sum > x){
                right--;
            }else if(sum<x){
                left++;
            }
         }
       }
    }

    public static void print(String s){
        System.out.println(s);
    }

}

