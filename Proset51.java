# Proset51
import java.util.Scanner;

public class Proset51 {
public static void main(String[] args){
  int m;
  int n;
  Scanner in=new Scanner(System.in);
  m=in.nextInt();
  n=in.nextInt();
  System.out.println("INPUT "+m+" "+n);
  if(m>=1&&n>0){
  int a=m*n;
  int output=a-1;
  System.out.println("OUTPUT "+output);
  }
  else{
    System.out.println("INVALID DATA");
  }
  in.close();
  
}
}
