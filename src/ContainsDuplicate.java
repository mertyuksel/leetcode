import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++)
            if(!set.add(nums[i]))
                return true;

        return false;
    }
}

