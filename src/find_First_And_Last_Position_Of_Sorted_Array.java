import java.util.Arrays;

public class find_First_And_Last_Position_Of_Sorted_Array {
    public static int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                first = i;
                while(i < nums.length && nums[i] == target) {
                    i++;
                }
                last = i - 1;
                return new int[]{first, last};
            }
        }
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,8,8,9};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}
