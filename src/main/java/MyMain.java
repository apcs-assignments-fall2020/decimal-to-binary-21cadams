import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int binary2=Integer.parseInt(binary);
        double counter = 0;
        int holder = 0;
        int total = 0;
        while(binary2 > 0){
            holder = binary2 % 2;
            total += holder * Math.pow(2.0, counter);
            binary2 = binary2 / 10;
            counter++;
        }
        System.out.println("This is equal to the decimal value " + total);
        return total;
    }
    
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your number"); 
        String binary = scan.nextLine(); 
        binaryToDecimal(binary);
        scan.close();
    }
}