package main.practice.algoritm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumMySolution(new int[]{2, 7, 11, 15}, 9)));

        System.out.println(Arrays.toString(twoSumHashMap(new int[]{2, 7, 11, 15}, 9)));

        System.out.println(Arrays.toString(twoSumHashMapImprove(new int[]{2, 7, 11, 15}, 9)));

    }

    public static int[] twoSumMySolution(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                if (currentNum + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("no solution");
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i , map.get(complement)};
            }
        }

        throw new IllegalArgumentException("no solution");
    }

    public static int[] twoSumHashMapImprove(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("no solution");
    }

}
