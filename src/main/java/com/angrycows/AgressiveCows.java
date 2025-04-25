package com.angrycows;

import java.util.Arrays;

class AgressiveCows {
    public static boolean canWePlace(int[] stalls, int cows, int minDist) {
        int count = 1;
        int lastPosition = stalls[0];
        
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= minDist) {
                count++;
                lastPosition = stalls[i];
            }
            if (count == cows) {
                return true;
            }
        }
        return false;
    }

    public static int maxMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, cows, mid)) {
                result = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return result;
    }
}
