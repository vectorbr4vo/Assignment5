import java.util.Scanner;
public class Problem5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your password.");
        String input = scan.next();
        System.out.println("Please retype your password.");
        String input2 = scan.next();
        while(!input2.equals(input)){
            input2=scan.next();

        }
    }
}
