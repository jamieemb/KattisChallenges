import java.util.Scanner;

public class tarifa {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // Number of megabytes available each month
        int n = scanner.nextInt();
        int temp = x;

        for (int i=0;i<n;i++){
            int p = scanner.nextInt();
            temp = (temp-p) + x;
        }
        System.out.println(temp);
    }
}
