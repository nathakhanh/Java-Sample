package main.practice.algoritm;


public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseMySolution(123));

    }

    public static int reverseMySolution(int x) {
        char[] charArray = ("" + x).toCharArray();
        StringBuilder sb = new StringBuilder();
        if (charArray[0] == '-') {
            sb.append("-");
        }
        for (int i = charArray.length-1; i >= 0; i--) {
            if (charArray[i] != '-') {
                sb.append(charArray[i]);
            }

        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }
    }

    public int reverse(int x) {
        return 0;
    }
}
