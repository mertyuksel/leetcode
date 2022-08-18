import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        int difference = 0;

        for (int i = 0; i < nums.length; i++)
        {
            difference = target - nums[i];

            if (!map.containsKey(difference))
                map.put(nums[i],i);
            else
                return new int[]{map.get(difference), i};
        }

        return new int[]{};
    }
}



