import java.util.*;

public class sortColor {

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine().trim();

    if (line.isEmpty()) {
        System.out.println("No input provided.");
        sc.close();
        return;
        
    }
    
    

    String[] input = line.split("\\s+");
    int[] nums = new int[input.length];

    for (int i = 0; i < input.length; i++) {
        nums[i] = Integer.parseInt(input[i]);
    }

    sortColors(nums);

    for (int num : nums) {
        System.out.print(num + " ");
    }

    sc.close();
}

}
