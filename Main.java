import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Refer to the Relation: T(n)= aT(n/b) + n^k");
        System.out.println("Now enter the value of a,b and k accordingly:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();

        //Validation Condition
        if( a < 1 || b < 2 || k < 0){
            System.out.println("Invalid Input");
            return;
        }

        double p=Math.log(a)/Math.log(b);
        double eps=1.0e-10;

        System.out.printf("Log_b(a): %.2f%n",p);

        if(p > k + eps){
            System.out.println("Case 1");
            System.out.printf("T(n) = Theta(n^%.6f)%n",p);
        }
        else if(Math.abs(p-k) <= eps){
            System.out.println("Case 2");
            System.out.printf("T(n) = Theta(n^%d log n)%n",k);
        }
        else{
            System.out.println("Case 3");
            System.out.printf("T(n) = Theta(n^%d)%n",k);
        }

    }
}