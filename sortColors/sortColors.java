public class Solution {
    public void sortColors(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                redCount++;
            }
            else if(nums[i] == 1){
                whiteCount++;
            }
            else if(nums[i] == 2){
                blueCount++;
            }
        }
        for(int i = 0; i < redCount; i++){
            nums[i] = 0;
        }
        for(int i = redCount; i < whiteCount + redCount; i++){
            nums[i] = 1;
        }
        for(int i = (whiteCount + redCount); i < (redCount + whiteCount + blueCount); i++){
            nums[i] = 2;
        }
    }
}
