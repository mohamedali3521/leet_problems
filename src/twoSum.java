import java.util.Arrays;

class twoSum {
    public static int[] twosum(int[] nums, int target) {
        int n=nums.length;
        int[] arr=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] nums={1,5,7,9,16};
        int target= 6;
        System.out.println(Arrays.toString(twosum(nums,target)));

    }
}
