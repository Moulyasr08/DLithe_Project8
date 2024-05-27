import java.util.Scanner;
public class primesum {
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        public static int sumOfDigits(int n) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    
        public static boolean hasPrimeDigitSum(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (isPrime(arr[i])) {
                    int digitSum = sumOfDigits(arr[i]);
                    if (isPrime(digitSum)) {
                        return true;
                    }
                }
            }
            return false;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
    
            System.out.println("Result: " + hasPrimeDigitSum(arr));
    
            scanner.close();
        }
    }
    