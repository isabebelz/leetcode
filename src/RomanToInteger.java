import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String roman = sc.next();

        int[] number = new int[roman.length()];

        int count = 0;

        for(int i = 0; i < roman.length(); i++) {
            switch (roman.charAt(i)) {
                case 'I': number[i] = 1;
                case 'V': number[i] = 5;
                case 'X': number[i] = 10;
                case 'L': number[i] = 50;
                case 'C': number[i] = 100;
                case 'D': number[i] = 500;
                case 'M': number[i] = 1000;
            }
        }

        for(int i = 0; i < roman.length(); i++) {
            for(int j = 0; j < roman.length(); j++) {
                if(number[i] >= number[j] && j != i) {
                    count += number[i];
                }
                else {
                    count -= number[i];
                }
            }
        }

        System.out.println("Output: " + count);

        sc.close();
    }
}
