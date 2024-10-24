import java.util.*;
public class Armstrong{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int num = sc.nextInt();
    int copyvalue = num;
    int remainder ;
    int sum = 0;
    while(num>0){
      remainder = num%10;
      sum = sum + (remainder*remainder*remainder);
      num = num/10;
    }
    if(sum == copyvalue){
      System.out.println("armstrong number!!!");
    }
    else{
      System.out.println(" not armstrong number!!!");
    }
  }
}
