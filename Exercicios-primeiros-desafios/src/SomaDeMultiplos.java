import java.util.Scanner;

public class SomaDeMultiplos {

  public static void main(String[] args) {
    int A, N;
    int soma;
    

    Scanner input = new Scanner(System.in);
    
    A = input.nextInt();
    N = input.nextInt();
    soma = 0;

    for (int i = 1; i <= N; i++ ) { 
      if(i % A == 0) { 
        soma += i; } } 
        System.out.println(soma); 
      } 
    }
    
    


