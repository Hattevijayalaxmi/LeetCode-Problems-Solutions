// Peak Index in a Mountain Array - LeetCode 852

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}

//Using Binary Search
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int low = 0, high = arr.length - 1;
       while(low < high) {
        int mid = low + (high - low) / 2;

        if(arr[mid] < arr[mid + 1]) {
            low = mid + 1;
        }else {
            high =  mid;
        }
       }
       return low;
    }
}
