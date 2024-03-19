package com.mycompany.exerciciosdowhile3;
import java.util.Scanner;
public class ExerciciosDOWHILE3 {
public static void main(String[] args) {

//2. Solicite um número inteiro positivo ao usuário e exiba a 
//soma de todos os números inteiros positivos até esse número.

Scanner teclado = new Scanner(System.in); 

System.out.println("Digite um número inteiro positivo: ");
int limite = teclado.nextInt();
int soma = 0 ;
int contador = 1;


do{
    System.out.println(contador);
    soma += contador;
    contador++;
   
  }

while (contador <= limite);
System.out.println("A soma dos números até " + limite + " é: " + soma);




}
}
