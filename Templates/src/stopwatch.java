import java.util.Scanner;

public class stopwatch {

    public static void main(String[] args) {


        int temp = 0;
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] t = new int[n];

        for (int i=0;i<n;i++) {
            t[i] = scanner.nextInt();
        }

        temp = t[0];
        for (int i = 1; i<t.length; i++){
            temp = t[i]-temp;
        }

        if (n % 2 == 0){
            System.out.println(temp);
        }
        else{
            System.out.println("still running");
        }
    }
}

