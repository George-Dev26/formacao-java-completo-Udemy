//                          SEÇÃO 04: ESTRUTURA DE REPETIÇÃO EM JAVA

// Ciclo 19         WHILE
/*
O While (que significa "enquanto")
é uma estrutura de repetição (ou loop) utilizada quando você precisa que um bloco de código
seja executado repetidamente enquanto uma determinada condição lógica for verdadeira.

 */

//import java.util.Scanner;

/*

public class Programa07 {
 public static void main ( String [] args ){

   int idade = 1;
   String nome;

   Scanner leitor = new Scanner(System.in);

   while (idade > 0) {

       System.out.print("Informe sua idade: ");
       idade = leitor.nextInt ();

       System.out.print("Informe o seu nome: ");
       nome = leitor.nextLine();

       System.out.println(nome + " tem" + idade + " anos");

   }
  leitor.close();


 }

}



 */



/*

//              DO WHILE
O Do While é um irmão muito próximo do while, mas com uma
diferença crucial na ordem em que as coisas acontecem: ele garante que o bloco de código
seja executado pelo menos uma vez, antes de testar se a condição é verdadeira ou falsa.

public class Programa08 {
    public static void main(String[] args) {

        int idade = 1;
        String nome;

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.print("Informe o seu nome: ");
            nome = leitor.nextLine();

            System.out.print("Informe sua idade: ");
            //idade = leitor.nextInt();
            idade = leitor.nextInt();

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos");
            }

        }
    while (idade > 0);
    leitor.close();

    }

}



 */

/*

// Ciclo 20:            FOR
O For é a estrutura de repetição ideal para quando você já sabe exatamente quantas vezes o bloco de código precisa ser executado.


public class Programa09 {
    public static void main(String[] args) {

    int idade;
    String nome;

    Scanner leitor = new Scanner(System.in);

// Variável de controle; condição de parada; forma de incremento

  for (int i = 0; i < 5; i++) {

      System.out.print("Informe o seu nome: ");
      nome = leitor.nextLine();

      System.out.print("Informe sua idade: ");
      idade = Integer.parseInt(leitor.nextLine());

      if (idade > 0) {
          System.out.println(nome + " tem " + idade + " anos");
      }
  }
  leitor.close();

    }
}


 */


/*


// Ciclo 21         FOREACH   (PARA CADA)
O For-Each (também conhecido como Enhanced For Loop ou loop "for" aprimorado)
é uma variação do for tradicional criada especificamente para percorrer arrays ou coleções de dados (como listas) do início ao fim.


public class Programa10 {
    public static void main(String[] args) {

    String nome = "Geek University";
// Para cada um dos caracteres da string, imprima o caractere
 for ( char letra : nome.toCharArray()){
     //System.out.println(letra);
     System.out.print(letra);
 }


    }
}


 */




//                      EXERCÍCIOS PARA PRATICAR


/*

//          Exercício 1

//1- Faça um programa que determine e mostre os cincos primeiros múltiplos de 3, considerando
//números maiores que 0.


public class Exercicio1 {
    public static void main(String[] args) {

    int contador = 0;
    for (int i = 1; contador < 5; i++){
      if(i % 3 == 0){
          System.out.println("O número " + i + " é múltiplo de 3.");
          contador  += 1;
      }
    }
  }
}


 */




//          Ecercício 2

//2- Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. A primeira vez,
//deve usar a estrutura de repetição for, a segunda while e a terceira do while.


public class secao04 {
    public static void main(String[] args) {

    int i;
// For
   System.out.println("Via For...");
   for ( i = 1; i <= 100; i++){
       System.out.println(i);
   }
   System.out.println("=================");
   i = 1; // Resetando

// While
   System.out.println("Via While...");
   while(i <= 100){
     System.out.println(i);
     i = i + 1;
   }
   System.out.println("=================");
i = 1; // Resetando

// Do While
    System.out.println("Via Do While");
do {
    System.out.println(i);
    i = i + 1;
} while (i <= 100);
    System.out.println("=================");

    }
}


 /*

//     Exercício 3


//3- Faça um programa que declara um valor inteiro, inicialize-o com 0, incremente-o de 1000 em
//1000, imprimindo seu valor na tela, até que seu valor seja 100000(cem mil).


public class secao04 {
    public static void main(String[] args) {

    int valor;

    for (valor = 0; valor <= 100000; ){
       System.out.println(valor);
       valor = valor + 1000;
    }


    }
}



  */

















