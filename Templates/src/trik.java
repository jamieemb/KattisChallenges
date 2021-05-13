import java.util.Scanner;

public class trik {

    public static void main(String[] args) {

        int bp = 1;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char move = s.charAt(i);

            if (bp == 1){
                switch(move){
                    case 'A':  {
                        bp = 2;
                        break;
                    }
                    case 'C' :{
                        bp = 3;
                        break;
                    }
                    default : break;
                }
            }
            else if (bp == 2){
                switch(move){
                    case 'A' : {
                        bp = 1;
                        break;
                    }
                    case 'B' : {
                        bp = 3;
                        break;
                    }
                    default : break;
                }
            }
            else if (bp == 3){
                switch(move){
                    case 'B' : {
                        bp = 2;
                        break;
                    }
                    case 'C' : {
                        bp = 1;
                        break;
                    }
                    default : break;
                }
            }
        }
        System.out.println(bp);
    }
}
