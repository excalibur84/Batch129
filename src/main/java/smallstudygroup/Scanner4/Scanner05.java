package smallstudygroup.Scanner4;

import java.util.Arrays;

public class Scanner05 {

    public static void main(String[] args) {

        int arr[][] = {{9, 14, 1}, {16, -22, 3}};

        System.out.println(m(arr));

    }

    public static int m(int[][] m) {

        int result = 3;

        for (int i = 1; i < m.length; i++) {


            for (int k = 0; k < m[i].length; k++) {


                result += m[i][k];

            }

        }

        return result;

    }
}