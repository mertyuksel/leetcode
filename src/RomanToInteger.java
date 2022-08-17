import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {

        HashMap<Character,Integer> romanNumerals = new HashMap<Character,Integer>()
        {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int integerValue = 0;

        for (int i = s.length() - 1; 0 <= i; i--)
        {
            if (i != 0 && romanNumerals.get(s.charAt(i)) > romanNumerals.get(s.charAt(i - 1)))
            {
                integerValue += romanNumerals.get(s.charAt(i)) - romanNumerals.get(s.charAt(i - 1));
                i--;
            }
            else
                integerValue += romanNumerals.get(s.charAt(i));
        }

        return integerValue;
    }
}

