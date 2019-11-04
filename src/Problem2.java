import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]) {
        int b = 0;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please type a number.");
        int input1 = scan1.nextInt();
        System.out.println("How many times would you like to double your number?");
        int input2 = scan2.nextInt();
        if(input1==input1){
            System.out.println(input1*Math.pow(input2,2));


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