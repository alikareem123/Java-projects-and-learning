package challenge;

public class Main {

    public static long maxSubarraySum(int[] arr, int n){
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];

            if(sum > maxi){
                maxi = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 6, 1};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);

        System.out.println(maxSum);
    }
}