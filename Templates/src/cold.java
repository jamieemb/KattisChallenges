import java.util.Scanner;

public class cold {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int n = sc.nextInt();
        int[] temps = new int[n];

        for (int i=0; i<n; i++){
            int temp = sc.nextInt();
            temps[i] = temp;

            if (temps[i] <0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
