import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number:");

        try {
            int n = number.nextInt();
            for (int i = 1; i <= n; i++){

                if (i%15==0) {
                    //multiple of 15 (3 and 5)
                    System.out.println("FizzBuzz");
                }
                else if (i%3==0){
                    //multiple of 3 
                    System.out.println("Fizz");
                }
                else if (i%5==0){
                    //multiple of 5 
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
            }
        }
        //error hangles input for integers
        catch(Exception e) {
            System.out.println("Error, please enter an integer");
        }
    }
} 