import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String roman = sc.nextLine();

        int number;
        int count = 0;

        for(int i = 0; i < roman.length(); i++) {
            if(roman.charAt(i) == 'I') {
                number = 1;
                count += number;
            }
            else if(roman.charAt(i) == 'V') {
                number = 5;
                count += number;
            }
            else if(roman.charAt(i) == 'X') {
                number = 10;
                count += number;
            }
            else if(roman.charAt(i) == 'L') {
                number = 50;
                count += number;
            }
            else if(roman.charAt(i) == 'C') {
                number = 100;
                count += number;
            }
            else if(roman.charAt(i) == 'D') {
                number = 500;
                count += number;
            }
            else if(roman.charAt(i) == 'M') {
                number = 1000;
                count += number;
            }
        }

        System.out.println("Output: " + count);

        sc.close();
    }
}
