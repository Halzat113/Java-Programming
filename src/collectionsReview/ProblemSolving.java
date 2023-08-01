package collectionsReview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProblemSolving {
    //problem: Two Sum
    // Given an array of integers nums and an integer target, return indexes of the two numbers such that they add up to target

    public static void main(String[] args) {
        int[]arr = {2,8,7,15,0};
        System.out.println(Arrays.toString(twoSum2(arr,9)));
    }

    static int[] twoSum(int[]arr,int target){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) return new int[]{i,j};
                }
    }
        return null;
    }
    static int[] twoSum2(int[]arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int potentialMatch = target-arr[i];
            if(map.containsKey(potentialMatch)){
                return new int[]{i,map.get(potentialMatch)};
            }else {
                map.put(arr[i],i);
            }
        }


        return null;
    }
}
