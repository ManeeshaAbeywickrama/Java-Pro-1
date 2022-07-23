package leetcode1;

public class Leetcode1 {

    public static void main(String[] args) {

        int[] nums = {3,3};
        int target = 6;
       

        for (int i = 0; i <= nums.length ; i++) {
            
           if( target == nums[i] + nums[i+1]){
               System.out.println(i + "," + (i+1));
               break;
           }
           
        }
    }

}
