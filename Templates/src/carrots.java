import java.util.Scanner;

public class carrots {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\s+");

        int[] intArray = new int[inputArray.length];

        for(int i=0; i< inputArray.length;i++){
            intArray[i] = Integer.parseInt(inputArray[i]);
        }

        for (int i=0;i<intArray[0]; i++){
            input= scanner.nextLine();
        }
        System.out.println(intArray[1]);
    }
}