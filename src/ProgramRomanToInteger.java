import java.util.Scanner;

public class ProgramRomanToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String roman = sc.next().toUpperCase();

        int[] number = new int[roman.length()];

        int count = 0;

        for(int i = roman.length() - 1; i >= 0; i--) {
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
            if(number[i] >= count) {
                count += number[i];
            }
            else {
                count -= number[i];
            }
        }

        System.out.println("Output: " + count);

        sc.close();
    }

}

