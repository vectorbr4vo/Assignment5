import java.util.Scanner;
public class Problem6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int count = 0,i;
        for(i=0;i<10;i++) {
        }
            System.out.println(count);
            System.out.println("Please enter a number.");
            int input = scan.nextInt();
            System.out.println("Please enter another number that's larger than your previous one.");
            int input2 = scan.nextInt();
            for (int f = input; f < input2; f++) {
                if (f % 7 == 0) {
                    System.out.println(f + " is a factor.");
                    count++;
                }

            }
            System.out.println("There are "+count+" factors.");
        }
    }


