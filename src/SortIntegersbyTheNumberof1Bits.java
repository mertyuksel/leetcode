import java.util.Arrays;

public class SortIntegersbyTheNumberof1Bits {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }

    public static int[] sortByBits(int[] arr) {

        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxedArray, (a,b) -> {

            if (Integer.bitCount(a) > Integer.bitCount(b)) {return 1;}
            else if (Integer.bitCount( a) < Integer.bitCount(b)) {return -1;}
            else {return a.compareTo(b);}

        });

        return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
    }
}
