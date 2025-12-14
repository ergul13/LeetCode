class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n){
            if(nums1[i] < nums2[j]){
                nums[k++] = nums1[i++];
            }
            else{
                nums[k++] = nums2[j++];
            }
        }
        while (i < m) nums[k++] = nums1[i++];
        while (j < n) nums[k++] = nums2[j++];

        int totalLen = nums.length;

        if(totalLen % 2 == 1){
            return (double) nums[totalLen / 2];
        }
        else {
            int mid1 = nums[totalLen / 2];
            int mid2 = nums[(totalLen / 2) - 1];
            return (mid1 + mid2) / 2.0;
        }

    }
}