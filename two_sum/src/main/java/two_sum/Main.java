package two_sum;

import java.util.*;

public class Main {

    public static String twoSum(int n, int[] arr, int target) {
        int left = 0;
        int right = n - 1;
        Arrays.sort(arr);
        while (left < right) {
            int sum = arr[right] + arr[left];
            if (sum == target) {
                return "Yes";
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return "No";
    }

    public static int[] two_sum(int n, int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            int moreNeeded = target - sum;
            if (mp.containsKey(moreNeeded)) {
                ans[0] = mp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            mp.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = two_sum(n, arr, target);
        System.out.println("This is the indices for the solution: " + ans[0] + " " + ans[1]);
        System.out.printf("The answer is : %s", twoSum(n, arr, target));
    }
}