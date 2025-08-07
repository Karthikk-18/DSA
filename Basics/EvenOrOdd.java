import java.util.Scanner;

public class EvenOrOdd {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = scanner.nextInt();

        // Returning true if it is EVEN && False Otherwise.
        System.out.println(OddOrEven(num));

        scanner.close();
    }

    public static Boolean OddOrEven(int num){
          // Even Numbers always give 2 as remainder if it is divide by 2.
          return num % 2 == 0;
    }
}
