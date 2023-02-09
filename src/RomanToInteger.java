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

        if(number[0] <= number[1]) {
            for(int i = 0; i < roman.length(); i++) {
                for(int j = 0; j < roman.length(); j++) {
                    if(number[i] >= number[j] && j != i) {
                        count += number[i];
                        break;
                    }
                    else if(number[i] <= number[j] && j != i){
                        count -= number[i];
                        break;
                    }
                }
            }
        }
        else {
            for(int i = 0; i < roman.length(); i++) {
                for(int j = 0; j < roman.length(); j++) {
                    if(number[i] >= number[j] && j != i) {
                        count += number[i];
                        break;
                    }
                    else if(number[i] <= number[j] && j != i){
                        count += number[i];
                        break;
                    }
                }
            }
        }

        System.out.println("Output: " + count);

        sc.close();
    }
}
