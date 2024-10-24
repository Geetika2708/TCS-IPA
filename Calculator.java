import java.util.*;
public class Calculator{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st number : ");
    int num_1 = sc.nextInt();
    System.out.println("enter 2nd number : ");
    int num_2 = sc.nextInt();
    System.out.println("enter the operator : ");
    char op = sc.next().charAt(0);

    if(op == '+'){
      System.out.println(num_1 + num_2);
    }
    else if(op == '-'){
      System.out.println(num_1 - num_2);
    }
    else if(op == '*'){
      System.out.println(num_1 * num_2);
    }
    else if(op == '/'){
      System.out.println(num_1 / num_2);
    }
    else {
      System.out.println("invalid operator!!! ");
    }
  }
}
