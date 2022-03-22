import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    double liczba1, wynik;
    System.out.println("Podaj pierwszą liczbę:");
    liczba1= myObj.nextFloat();
    wynik= 1.8*liczba1+32;
    System.out.println(wynik);
  }
}