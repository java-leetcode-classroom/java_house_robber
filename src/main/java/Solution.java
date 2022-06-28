public class Solution {
  public int rob(int[] nums) {
    int nLen = nums.length;
    int prevTwo = 0;
    int prevOne = nums[nums.length-1];
    int currentMax = 0;
    for (int start = nLen -2; start >= 0; start--) {
      currentMax = Math.max(nums[start]+prevTwo, prevOne);
      prevTwo = prevOne;
      prevOne = currentMax;
    }
    return Math.max(prevOne, prevTwo);
  }
}
