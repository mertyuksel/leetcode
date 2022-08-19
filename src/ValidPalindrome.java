public class ValidPalindrome {

    public static void main(String[] args)
    {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            if (!Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;

            left++;
            right--;
        }

        return true;
    }


    // Alternative

    /*
    public static boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++)
        {
            if (!Character.isLetterOrDigit(sb.charAt(i)))
            {
                sb.deleteCharAt(i);
                i--;
            }
        }

        String str = sb.toString().toLowerCase();
        String reverseStr = sb.reverse().toString().toLowerCase();

        if (str.equals(reverseStr))
            return true;

        return false;
    }
    */
}