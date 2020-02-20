
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Used shifting to solved the problem. Used 2 pointers one on nums1 and the other n nums2. Whenever nums2<nums1 I shift the array and add the value to the desired space 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = m;

        while (i < m && j < n) {

            if (nums2[j] <= nums1[i]) {
                numshift(nums1, i, m);
                nums1[i] = nums2[j];
                i++;
                j++;
                m++;

                for (int b = 0; b < nums1.length; b++) {
                    System.out.print(" " + nums1[b]);
                }
            } else if (nums2[j] > nums1[i]) {
                i++;

            }

        }
        System.out.println("j " + j);
        System.out.print("n " + n);
        if (j <= n) {
            for (int a = m; a < nums1.length; a++) {
                nums1[a] = nums2[j];
                j++;
            }
        }

    }

    private void numshift(int[] nums, int low, int high) {
        for (int k = high - 1; k >= low; k--) {
            nums[k + 1] = nums[k];
        }
    }
}