import java.util.Scanner;
public class Continous {
  
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }
	        System.out.println(arrayelements(a));
	    }
	    public static boolean arrayelements(int[] arr) {
	        for (int i = 0; i < arr.length - 2; i++) {
	            if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2) {
	                return true;
	            }
	        }
	        return false;
	    }
	}



