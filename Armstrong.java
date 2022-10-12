
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
       int n = input.nextInt();
        int counter = 0 , sum = 0, num = n, ssum = num, i = ssum;

            while (n > 0) {
              //check how much numbers are in our input number
                n/=10;
                counter++;

             }   System.out.println("number of numbers : "+counter);

            while (num>1){

                num=i%10;
                System.out.println("number raise to a given power: "+num);
                sum = (int) Math.pow(num,counter)+sum; //sum of powerd numbers
                i/=10;



        }
            if (sum == ssum){
            System.out.println("it's Armstrong number");
        }   else {
            System.out.println("it isn't Armstrong number");
        }

    }

}