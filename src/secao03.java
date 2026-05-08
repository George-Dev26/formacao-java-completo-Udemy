//                  SEÇÃO 03: ESTRUTURA DE DECISÃO EM JAVA


//Ciclo 13 		IF, ELSE, ELSE IF

/*
IF, Else: Elas permitem que o seu programa Java tome decisões e execute diferentes blocos
de código dependendo de uma condição lógica (verdadeira ou falsa).



public class Programa04 {
    public static void main(String[] args) {

        int num = 9;

        if (num > 5) {

            System.out.println("Sim, o número: " + num + " é maior que 5");
        } else if (num == 5) {
            System.out.println("O número " + num + " é igual a 5");

// Verificando se é Par
        } else if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");

        } else {
            System.out.println("Não, o número " + num + " não é maior que 5");
        }
    }
}



// =======================================================================================


//Ciclo 14        Operador ternário

/*
 O operador ternário é uma forma compacta de escrever uma estrutura if-else em apenas uma única linha de código.
Ele é muito utilizado para tornar o código mais limpo e legível quando você precisa atribuir um valor a uma variável baseado em uma condição simples.

public class Programa05 {
    public static void main(String[] args) {

   int valor = -3, num;

   if (valor > 0){
       num = valor;
   } else {
       num = 7;
   }


// isso é um operador ternário, ele apenas executa o if e else.
    num = (valor > 0 ) ? valor : 7;
    System.out.println(num);

    }
}

 */



// =======================================================================================


//Ciclo 15     Introdução a Switch

/*
 O Switch é uma estrutura de controle e decisão que funciona como uma alternativa
ao if-else-if quando você precisa comparar uma mesma variável com múltiplos valores constantes.
Ele é especialmente útil para tornar o código mais limpo e legível quando há muitas opções de escolha.



public class Programa06 {
    public static void main(String[] args) {

    int num = 3;

      switch (num){
          case 1:
              System.out.println("O número é 0");
          break;
          case 3:
              System.out.println("O número é 3");
          break;
          case 5:
              System.out.println("O número é 5");
          default:
              System.out.println("O número é " + num);
          break;
      }

    }
}


 */

// =======================================================================================

//Ciclo 16                          EXERCÍCIOS

/*
1. Faça um programa que peça ao usuário para digitar dois números e mostre qual deles é o maior.
2. Faça um programa que peça ao usuário para digitar um número. Se esse número for positivo,
calcule a raiz quadrada do número. Se o número for negativo, mostre uma mensagem dizendo que
o número é inválido.
3. Faça um programa que peça ao usuário para digitar um número e diga se o número digitado é
par ou ímpar.

 */



import java.util.Scanner;

/*                              EXERCÍCIO 01

public class secao03 {
    public static void main(String[] args) {

     Scanner leitor = new Scanner(System.in);
     int num1, num2;

     System.out.print("Digite o primeiro número: ");
     num1 = leitor.nextInt();

     System.out.print("Digite o segundo número: ");
     num2 = leitor.nextInt();

     if (num1 > num2) {
         System.out.println("O maior é o primeiro número: " + num1);
     } else if ( num1 == num2) {
            System.out.println("Os dois númeors são iguais.");
        } else {
         System.out.println("O maior é o segundo número: " + num2);
     }

     leitor.close();
    }
}


 */


/*                          EXERCÍCIO 02


public class secao03 {
    public static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);
      int num;

      System.out.print("Informe um número inteiro: ");
      num = leitor.nextInt();

    if( num > 0){
        System.out.println("A raiz quadrada de " + num + " é" + Math.sqrt(num));
    } else {
        System.out.println("O número " + num + " é inválido.");
    }

leitor.close();
    }
}


 */


public class secao03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num;
    System.out.print("Informe um número inteiro: ");
    num = leitor.nextInt();

    if (num % 2 == 0) {
        System.out.println("O número " + num + " é par.");
    } else {
        System.out.println("O número " + num + " é ímpar");
    }

leitor.close();


    }
}























