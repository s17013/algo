import java.util.Scanner;

public class K0703 {

  public static void main (String[]args){
    Scanner stdIn = new Scanner(System.in);
    int n;

    System.out.print("正方形を表示する");

    do {
      System.out.print("段数は？ :");
      n = stdIn.nextInt();
    }while (n <= 0 );

    for (int i = 1; i <= n; i++){
      for (int j = 1; j <= n; j++)
        System.out.print('✺');
      System.out.println();
    }
  }
}
