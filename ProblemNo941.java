class Solution {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;

        if(n < 3) {
            return false;
        }

        int peak = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i - 1]) {
                peak = i;
            } else {
                break;
            }
        }
        if(peak == 0 || peak == n - 1) {
            return false;
        }
        for(int i = peak + 1; i < n; i++) {
            if(arr[i] >= arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
