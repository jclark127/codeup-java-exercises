import java.util.Arrays;

public class InClass0301 {

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 6, 8, 9, 4};
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sumOne += nums[i];
            } else {
                sumTwo += nums[i];
            }
        }
        int[] newNums = {sumOne, sumTwo};
        System.out.println(Arrays.toString(newNums));
    }

}
