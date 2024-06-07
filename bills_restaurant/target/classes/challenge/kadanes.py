import sys

def maxSubarray(arr, n):
    maxi = -sys.maxsize-1
    sum = 0

    for i in range(n):
        sum += arr[i]

        if sum > maxi:
            maxi = sum
        
        if sum < 0:
            sum = 0
    
    return maxi

arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
n = len(arr)
maxSum = maxSubarray(arr, n)
print("The maximum of the subarrya is: ", maxSum)