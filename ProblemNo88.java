# Merge Sorted Array - LeetCode 88

🚀 Java solution for the **Merge Sorted Array** problem using the **Two Pointer Approach**.

---

## Problem Statement

You are given two sorted integer arrays `nums1` and `nums2`.

- `nums1` has a size of `m + n`
- First `m` elements are valid
- Last `n` elements are `0` placeholders
- `nums2` contains `n` sorted elements

Merge `nums2` into `nums1` as one sorted array in non-decreasing order.

---

## Example

### Input

```bash
nums1 = [1,2,3,0,0,0]
m = 3

nums2 = [2,5,6]
n = 3
'''
    
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        // Merge arrays from the end
        while (p1 >= 0 && p2 >= 0) {

            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }

            p--;
        }

        // Copy remaining nums2 elements
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
