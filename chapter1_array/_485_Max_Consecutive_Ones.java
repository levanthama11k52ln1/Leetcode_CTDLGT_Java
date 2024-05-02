public class _485_Max_Consecutive_Ones {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int len_max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } 
            else {
                if (len_max <= count) {
                    len_max = count;
                }   
                count = 0;
            }
        }
        if (len_max <= count) {
            len_max = count;
        }
        return len_max;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums2));
    }
}