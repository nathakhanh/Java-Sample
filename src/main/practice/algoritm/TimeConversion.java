package main.practice.algoritm;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:40:22AM"));
    }

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String indicator = s.substring(s.length() - 2);
        if (indicator.equals("PM")) {
            if (s.substring(0, 2).equals("12")) {
                return "12" + s.substring(2, s.length() - 2);
            }
            int hour = Integer.parseInt(s.substring(0,2));
            hour += 12;
            return hour + s.substring(2, s.length() - 2);
        } else if (indicator.equals("AM")) {
            if (s.substring(0, 2).equals("12")) {
                return "00" + s.substring(2, s.length() - 2);
            }
            return s.substring(0, s.length() - 2);
        }

        return null;
    }
}
