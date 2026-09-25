import java.util.Arrays;
public class bubbleSort {
    public int[] bubblesort(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        bubbleSort b = new bubbleSort();
        int[] nums = {2, 14, 3};
        System.out.println(Arrays.toString(b.bubblesort(nums)));
    }
}