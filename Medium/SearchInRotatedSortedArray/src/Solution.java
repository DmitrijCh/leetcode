public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid;
        while (l <= r) {
            mid = l + r >>> 1;
            if (nums[mid] == target) return mid;
            else if (nums[mid] >= nums[l]) {
                if (nums[l] <= target && target < nums[mid]) r = mid - 1;
                else l = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[r]) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }
}

/*
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
 */