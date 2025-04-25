package com.angrycows;

public class BookAllocation {
    public static boolean isPossible(int[] arr, int m, int maxPages) {
        int students = 1;
        int currentPages = 0;
        for (int pages : arr) {
            if (pages > maxPages) {
                return false;
            }
            if (currentPages + pages > maxPages) {
                students++;
                currentPages = pages;
            } else {
                currentPages += pages;
            }
        }
        return students <= m;
    }

    public static int allocateMinimumPages(int[] arr, int m) {
        if (arr.length < m) {
            return -1;
        }
        int low = arr[0];
        int high = 0;
        for (int pages : arr) {
            low = Math.max(pages, low);
            high += pages;
        }

        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
