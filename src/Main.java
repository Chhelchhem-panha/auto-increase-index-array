import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialSize = 5;
        int[] numbers = new int[initialSize];
        int count = 0;

        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter a number (or enter -1 to stop): ");
            int num = scanner.nextInt();

            if (num == -1) {
                continueInput = false;
            } else {
                if (count == numbers.length) {
                    int newSize = numbers.length * 2;
                    int[] newArray = new int[newSize];
                    System.arraycopy(numbers, 0, newArray, 0, numbers.length);
                    numbers = newArray;
                }

                numbers[count] = num;
                count++;
            }
        }

        System.out.println("Input numbers are:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}