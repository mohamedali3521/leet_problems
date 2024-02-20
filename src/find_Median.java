import java.util.Arrays;

class findMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums3=new int[m+n];
        for(int i=0;i<m;i++)
        {
            nums3[i]=nums1[i];
        }
        for(int j=0;j<n;j++)
        {
            nums3[m+j]=nums2[j];
        }
        Arrays.sort(nums3);
        int s=nums3.length/2;
        if(nums3.length%2==0)
        {
            return ((double)nums3[s-1]+(double)nums3[s])/2;
        }
        else
        {
            return nums3[s];
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println(Arrays.toString(new double[]{findMedianSortedArrays(nums1, nums2)}));
    }
}