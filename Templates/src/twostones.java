import java.util.Scanner;

public class twostones {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();

        if (n % 2 != 0){
            System.out.println("Alice");
        }
        else{
            System.out.println("Bob");
        }
    }
}
