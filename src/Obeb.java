import java.util.Scanner;
public class Obeb {
    public static void main(String[] args) {

        int obeb=1, okek=1,k, n, smallnumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Please give me first number: ");
        k = input.nextInt();
        System.out.println("Please give me second number: ");
        n = input.nextInt();
        smallnumber = Math.min(k, n);
        int i= smallnumber;

       while(i >= 1){
            if (k % i ==0 && n % i ==0){
                obeb = i;
                System.out.println("Gcf is "+ obeb);
                break;
            }
            i--;
    } int j = 1;
       while (j <= k*n) {
           if (j % k == 0 && j % n ==0 ){
             okek = j; System.out.println("Lcm is "+ okek);
             break;
           } j++;

       }
}}
