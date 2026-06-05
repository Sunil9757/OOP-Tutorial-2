import java.util.Scanner;

public class Prime_Number {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any number:");
       int n=sc.nextInt();

       int count=0;

       if(n<0){
           System.out.println("Negative number");
       }
       else if (n<=1){
           System.out.println("Not Prime");
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0) {
                    count++;
                }
            }
                if (count==0) {
                    System.out.println("Prime");
                }else{
                    System.out.println("Not Prime");
            }
        }
        sc.close();
    }
}
