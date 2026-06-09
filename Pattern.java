// import java.util.Scanner;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");

//                 if (j < i) {
//                     System.out.print("-");
//                 }
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                if(j<i)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}