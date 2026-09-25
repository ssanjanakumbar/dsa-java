import java.util.Arrays;
public class insertionSort {
        public int[] insertionsort(int[] nums) {
            for(int i=0;i<=nums.length-1;i++){
                int j=i;
                while(j>0 && nums[j-1]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    j--;
                }
            }
            return nums;
        }
        public static void main(String[] args){
            int[] nums = {22, 14, 3};
            insertionSort i=new insertionSort();
            System.out.println(Arrays.toString(i.insertionsort(nums)));        }
    }

