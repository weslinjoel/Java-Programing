 public class Creatematrix {

         public static void main(String[] args) {
             int a[][] = {{9, 2, 4}, {2, 4, 8}, {3, 3, 5}};
             int b[][] = {{3, 3, 4}, {2, 6, 3}, {2, 2, 3}};
             int c[][] = new int[3][3];
             for (int i = 0; i < 3; i++) {
                 for (int j = 0; j < 3; j++) {
                     c[i][j] = a[i][j] + b[i][j];
                     System.out.print(c[i][j] + " ");
                 }
                 System.out.println();
             }
         }
     }
