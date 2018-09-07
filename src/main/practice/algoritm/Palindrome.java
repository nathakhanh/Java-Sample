package main.practice.algoritm;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromeMySolution(11211));
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindromeMySolution(int x) {
        if (x < 0) {
            return false;
        }

        int digits = (int) (Math.log10(x) + 1);
        int middleDigits = digits / 2;
        char[] inputChar = ("" + x).toCharArray();

        for (int i = 0, j = digits-1; i < middleDigits; i++, j--) {
            if (!(inputChar[i] == inputChar[j])) {
                return false;
            }

        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverseNumber = 0;
        while(x > reverseNumber) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }

        return x == reverseNumber || x == reverseNumber/10;
    }
}
