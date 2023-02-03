import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String roman = sc.next();

        int[] number = new int[roman.length()];

        int count = 0;

        for(int i = 0; i < roman.length(); i++) {
            if(roman.charAt(i) == 'I') {
                number[i] = 1;
            }
            else if(roman.charAt(i) == 'V') {
                number[i] = 5;
            }
            else if(roman.charAt(i) == 'X') {
                number[i] = 10;
            }
            else if(roman.charAt(i) == 'L') {
                number[i] = 50;
            }
            else if(roman.charAt(i) == 'C') {
                number[i] = 100;
            }
            else if(roman.charAt(i) == 'D') {
                number[i] = 500;
            }
            else if(roman.charAt(i) == 'M') {
                number[i] = 1000;
            }
        }

        for(int i = 0; i < roman.length(); i++) {
            if(number[i] > number[i + 1]) {
                count = number[i] + number[i + 1];
            }
            else {
                count = (number[i + 1] - number[i]);
            }
        }

        System.out.println("Output: " + count);

        sc.close();
    }
}
