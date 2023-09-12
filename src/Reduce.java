import java.util.Scanner;
public class Reduce {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        reader.close();
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n/2;
            }
            else {
                n -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
