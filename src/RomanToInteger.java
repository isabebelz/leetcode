import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String roman = sc.nextLine();

        int count = 0;

        for(int i = 0; i < roman.length(); i++) {
            if(roman.charAt(i) == 'I') {
                count += 1;
            }
            else if(roman.charAt(i) == 'V') {
                count += 5;
            }
            else if(roman.charAt(i) == 'X') {
                count += 10;
            }
            else if(roman.charAt(i) == 'L') {
                count += 50;
            }
            else if(roman.charAt(i) == 'C') {
                count += 100;
            }
            else if(roman.charAt(i) == 'D') {
                count += 500;
            }
            else if(roman.charAt(i) == 'M') {
                count += 1000;
            }
        }

        System.out.println("Output: " + count);

        sc.close();
    }
}
