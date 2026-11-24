import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a, b and k: ");
  int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
  if (a < 1 || b < 2 || k < 0) { System.out.println("Invalid input."); return; }
  double p = Math.log(a) / Math.log(b), eps = 1.0e-10;
  System.out.printf("log_b(a) = %.6f%n", p);
  if (p > k + eps) { System.out.println("Case 1"); System.out.printf("T(n) = Theta(n^%.6f)%n", p); }
  else if (Math.abs(p-k) <= eps) { System.out.println("Case 2"); System.out.printf("T(n) = Theta(n^%d log n)%n", k); }
  else { System.out.println("Case 3"); System.out.printf("T(n) = Theta(n^%d)%n", k); }
 }
}
