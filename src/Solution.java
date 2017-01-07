public class Solution {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        double M[][] = new double[n][m + 1];


        M[0][0] = 2;
        M[0][1] = -2;
        M[0][2] = 1;

        M[1][0] = 1;
        M[1][1] = 3;
        M[1][2] = -2;

        M[2][0] = 3;
        M[2][1] = -1;
        M[2][2] = -1;

        // x, y, z
        M[0][3] = 3;
        M[1][3] = 1;
        M[2][3] = 2;


        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(" " + M[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=====");


        for (int i = 0, j = 0; i < M.length; i++, j++) {

            if (M[i][j] != 1) {
                double div = M[i][j];
                for (int k = 0; k < M[i].length; k++) {
                    M[i][k] /= div;
                }
            }


            for (int k = i + 1; k < n; k++) {
                if (M[k][j] != 0) {
                    double rev = -M[k][j];
                    for (int l = 0; l < M[k].length; l++) {

                        M[k][l] += M[i][l] * rev;
                    }
                }
            }

            for (int k = i - 1; k >= 0; k--) {
                if (M[k][j] != 0) {
                    double rev = -M[k][j];
                    for (int l = 0; l < M[k].length; l++) {

                        M[k][l] += M[i][l] * rev;
                    }
                }
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(" " + M[i][j] + " ");
            }
            System.out.println();
        }


    }


}
