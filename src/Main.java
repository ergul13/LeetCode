import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Palindrom p = new Palindrom();
        p.isPalindrome(1234);
        RomanDigits r = new RomanDigits();
        r.romanToInt("XX");
        MergeArray m = new MergeArray();
        int[] nums1 = {1,2,3,0,5,0};
        int[] nums2 = {2,5,6};
        m.merge(nums1,3,nums2,3);
        System.out.println("Merged nums1: " + Arrays.toString(nums1));

    }
}