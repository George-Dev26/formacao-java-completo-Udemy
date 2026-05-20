//              Seção 06:  VETORES E MATRIZES EM JAVA

// Ciclo 31   Vetores - Parte 1  ( Arrays uni-dimensionais)
/*
int numros[5];  //0 .. 4 (n - 1) 5 - 1 = 4
float valores[5];  // 0.. 9

numeros[0] = 1;  // Começo do array
numeros[1] = 3;
numeros[2] = 5;
numeros[3] = 7;
numeros[4] = 9;   // Final do Array

 */

/*
public class Programa16 {
    public static void main(String[] args) {
// Declarando um vetor
   int vetor[];

// Declarando e especificando o tamanho do vetor
  int numeros[] = new int[5];

// Declarado, especificando o tamanho e inicializando
  int outros_numeros[] = {1, 3, 5, 7, 9};

  float valroes[] = new float[5];
  char caracteres[] = new char[20];
  String nomes[] = new String[4];


  String frutas[] = {"Manga.", "Uva", "Banana"};



    }
}


// =======================================================================================

// Ciclo 32   VETORES - PARTE 2

public class Programa17 {
    public static void main(String[] args) {

        int numeros[] = new int[10];

        System.out.println("Tamanho do vetor: " + numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3;

        }
        System.out.println(numeros[0]);  //Primeiro elemento
        System.out.println(numeros[9]);  //Último elemento


//Os VETORES POSSUEM TAMANHO FIXO E NÃO PODE SER ALTERADO.
// OS VETORES/ARRAYS POSSUEM TIPOS DE DADOS FIXOS E NÃO ACEITAM TIPOS VARIADOS.
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.round(Math.random() * 10);

        }
        System.out.println(numeros[0]);  //Primeiro elemento
        System.out.println(numeros[9]);  //Último elemento

        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println(Math.round(Math.random() * 10));

        for (int i : numeros){
            System.out.println(i);
        }

    }
}



// =======================================================================================

// Ciclo 33   MATRIZES - PARTE 1

// Matrizes: são LINHAS E COLUNAS [][]
// numeros[0][0] = 1;
// numeros[2][2] = 2;

public class Programa18 {
    public static void main(String[] args) {

// Declração
   int outros_numeros[][];

// Declrando e definindo o tamanho da matriz
   int numeros[][] = new int [3][3];

// Declarando, definindoo tamanho e inicializando
   int mais_numeros[][] = { {1, 2, 3,}, {4, 5, 6}, {7, 8, 9} };

//Declarando uma matriz informando somento as linhas
   int matriz[][] = new int[2][];
   matriz[0] = new int[5];
   matriz[1] = new int[3];

   int nova_matriz[][] = { {1, 2}, {4, 5, 6, 7, 8}, {9, 10, 11} };

    }
}


// =======================================================================================

// Ciclo 34  MATRIZES - PARTE 2

public class Programa19 {
    public static void main(String[] args) {

    int numeros[][] = new int[3][3];
        numeros[0][0] = 1;
        numeros[0][1] = 3;
        numeros[0][2] = 5;
        numeros[1][0] = 7;
        numeros[1][1] = 9;
        numeros[1][2] = 11;
        numeros[2][0] = 13;
        numeros[2][1] = 15;
        numeros[2][2] = 17;

        System.out.println(numeros[1][2]);

        for ( int i = 0; i < numeros.length;i++){

        for(int j = 0;j < numeros[i].length; j++){
            System.out.println("numeros[" + i + " ] [" + j + "] = " + numeros[i][j]);
           // numeros[i][j] = i + j * 2;
            }

        }

    }
}




// =======================================================================================
*/

//             EXERCÍCIO PARA PRATICAR
/*
1- Faça um programa que possua um vetor, denominado A, que armazene 6 números inteiros. O
programa deve executar os seguintes passos:

a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7;
b) Armazene em uma variável inteira a soma entre os valores das posições A[0],A[1] e A[5] do
vetor e mostre na tela esta soma;
c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100;
d) Mostre na tela cada valor do vetor A, um em cada linha.

 */
/*

public class Exercicio1 {
    public static void main(String[] args) {

     int A[] = new int[6];
     int soma;
     A[0] = 1;
     A[1] = 0;
     A[2] = 5;
     A[3] = -2;
     A[4] = -5;
     A[5] = 7;

  soma = A[0] + A[1] + A[5];
System.out.println("A soma é " + soma);

A[4] = 100;

    for(int i = 0; i < A.length; i++) {
        System.out.println(A[i]);
    }

    }

}



// =======================================================================================


//                      EXERCÍCIO 2
//2- Faça um programa que leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.

//import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);

    int matriz[][] = new int[4][4];
    int conta_10 = 0;

    for (int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz.length; j++){
            System.out.print("Informe o valor inteiro para a matriz[" + i + "]" + "[" + j + "]");
            matriz[i][j] = Integer.parseInt(leitor.nextLine());

            if(matriz[i][j] > 10) {
                conta_10 = conta_10 + 1;

            }
        }
    }
    System.out.print("A matriz possui " + conta_10 + " valores maiores que 10. ");

leitor.close();


    }
}


// =======================================================================================

//              EXERCÍCIO 3
/*

3- Escreva um programa que leia uma matriz 5 x 5 e um valor X. O programa deverá fazer uma
busca desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma
mensagem de "não encontrado".




public class Exercicio {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int X;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Informe o valor inteiro para a matriz[" + i + "]" + "[" + j + "]");
                matriz[i][j] = Integer.parseInt(leitor.nextLine());
            }
        }

        System.out.println("Informe um valor inteiro para buscar na matriz: ");
        X = Integer.parseInt(leitor.nextLine());
        int encontrou = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] == X) {
                    System.out.println("O valor " + X + " está presente na posição matriz[" + i + "]" + "[" + j + "]");
                    encontrou = 1;
                }
            }
        }
        if(encontrou < 1){
            System.out.println("Não encontrado.");
        }
    }
}



 */












