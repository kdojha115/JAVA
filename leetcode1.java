//33. Search in Rotated Sorted Array

class leetcode1 {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        return -1;
        
    }
}
