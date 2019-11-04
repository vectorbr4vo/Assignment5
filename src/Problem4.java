import java.util.Scanner;

public class Problem4 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("How many grades would you like to enter?");
        int input = scan.nextInt();
        int[] numbers = new int[input];

        System.out.println("Please input numbers for your grades.");
        for (int i = 0; i < input; i++) {
            numbers[i]=scan.nextInt();
        }
        System.out.println(input);
        for (int i = 0; i < input; i++) {
            sum1 = sum1 + numbers[i];
        }
        sum2 = sum1/input;
        System.out.println(sum2);
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