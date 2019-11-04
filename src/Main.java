import sun.font.TrueTypeFont;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please type the number 7.");
        int input1 = scan1.nextInt();
        while (input1 < 7.0||input1 > 7.0) {
            System.out.println("Wrong key. Please try again.");
            input1 = scan1.nextInt();
        }
    }
}

/*int x=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your age.")
        int age = scan.nextInt();
        while(age<0){
            System.out.println("Can't be less than zero, try again.");
            age=scan.nextInt();
        }

        while (x<10){
            System.out.println("loop ")
        }
        int y=0;
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        int k;
        String greet="Hello There!";
        for(int k=0; k<greet.length(); k++){
            String letter  = greet.substring(k,k+1);

            if(!letter.equals("e")){
                System.out.println(letter);
                break;
            }
            System.out.println("loop number =" + k)
            }*/

