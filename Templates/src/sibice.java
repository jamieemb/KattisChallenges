import java.util.Scanner;

public class sibice {

    public static void main (String[] args){

        int n,d,a;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArray = input.split("\\s+");
        int[] intArray = new int[inputArray.length];

        for(int i=0; i< inputArray.length;i++){
            intArray[i] = Integer.parseInt(inputArray[i]);
        }

        a = intArray[0];
        String[] output = new String[a];

        d = (int) Math.sqrt((int) Math.pow(intArray[1], 2) + (int) Math.pow(intArray[2], 2));

        for (int i = 0; i < a; i++){
            n = scanner.nextInt();
            if (n <= intArray[1] || n <= intArray[2] || n <= d){
                output[i] = "DA";
            }
            else{
                output[i] = "NE";
            }
        }

        for (String s : output) {
            System.out.println(s);
        }
    }
}