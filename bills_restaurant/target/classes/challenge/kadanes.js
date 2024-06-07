function maxSubArray(arr, n) {
    let maxi = Number.MIN_SAFE_INTEGER;
    let sum = 0;

    for(let i = 0; i < n; i++){
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

const arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
const n = arr.length;
const maxSum = maxSubArray(arr, n);
console.log("The maximum subarray sum is: " + maxSum);