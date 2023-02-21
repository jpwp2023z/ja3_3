//Zadanie3_3. Tablice
//Wyświetlić tabliczkę mnożenia
import java.util.Scanner;
class Main {
  public static void main (String[] args)
  {
    int x = 10;   
    for(int i=1;i<=x;i++)
      {
        for(int j=1;j<=x;j++)
          {
            System.out.print(j*i+ "\t");
          }
        System.out.println("");
      }
  }
}