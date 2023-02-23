package MinDisBetBST;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDistanceBetweenBST {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the root of the binary search tree: ");
        int root = sc.nextInt();

        int[] rootNodes = new int[root];
        int[] root_2 = new int[root];

        int mDifB;

        System.out.print("Input: ");
        for(int i = 0; i < rootNodes.length; i++) {
            rootNodes[i] = sc.nextInt();
        }

        for(int i = 0; i < rootNodes.length; i++) {
            for(int j = 0; j < rootNodes.length; j++) {
                if(rootNodes[i] > rootNodes[j]) {
                    root_2[i] = rootNodes[j];
                }
                else {
                    root_2[i] = rootNodes[i];
                }
            }
        }

        System.out.println(Arrays.toString(root_2));

        if(root_2[0] > root_2[1]) {
            mDifB = root_2[0] - root_2[1];
        }
        else {
            mDifB = root_2[1] - root_2[0];
        }

        System.out.println("Output: " + mDifB);

        sc.close();
    }
}
