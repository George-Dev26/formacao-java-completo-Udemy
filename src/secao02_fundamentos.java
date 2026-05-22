//       A Seção 1 foi apenas apresentação.

//		 SEÇÃO 2: INTRODUÇÃO A LINGUAGEM JAVA



// Ciclo do 1 ao 6, foram apenas introdução.


/*
//CICLO 7 	      VARIÁVEIS

Uma variável é um espaço na memória do computador reservado para armazenar um dado que pode
ser alterado durante a execução do programa. Imagine que a memória do seu PC é um grande armário cheio de gavetas;
uma variável é uma dessas gavetas com uma etiqueta específica.


    public class Programa01 {
        public static void main (String [] args ) {

// Declarando uma variável
            int valor;
// Declarando várias variáveis
            int num1, num2, num3;
// Declarando e inicializando algumas variáveis
            int num4, num5 = 4, num6 = 7, num8;
            char caractere;
            float preco;
// Declarando e inicializando
            int num10 = 99;
// int 10eu = 7; dará erro logo de cara
            float _valor = 34.2f; // O f no final do código é pra dizer ao Java que é uma variável do tipo Float. Por padrão, os valores de ponto flutuante são double no Java
            double _valor2 = 34.2;
        }
    }

 */

//   =====================================================================================================

/*

//CICLO 8  		O COMPILADOR E O BYTECODE

O compilador é a ferramenta que transforma o código que você escreve
(o arquivo .java, que os humanos entendem) em algo que a máquina pode processar.

O Bytecode é o conteúdo dentro desse arquivo .class. Ele não é código de
máquina puro (binário de processador), mas sim uma linguagem de baixo nível otimizada para o Java.



    public class Programa02 {
        public static void main (String [] args ) {

            int idade = 30;

            System.out.println("Eu tenho " + idade + " anos");


// Código fonte (Programa.Java) > Bytecode (Programa.class) > executável


        }
        }

 */


//   =====================================================================================================



/*


//CICLO 9		FUNÇÃO MAIN()

A função main é o ponto de entrada de qualquer aplicação Java. Sem ela,
a JVM (Java Virtual Machine) não saberia por onde começar a executar o seu código.


    public class Programa03 {

        // Essa função que torna a classe java em um programa Java
        public static void main (String [] args ) {


        }
    }

//   =====================================================================================================



 */



//CICLO 10			EXERCÍCIO PARA PRATICAR

/*
1. Faça um programa que leia um número inteiro e o imprima.

2. Faça um programa que peça ao usuário para digitar três valores
inteiros e imprima a soma deles.

3. Faça um programa que peça ao usuário para digitar um número
real e imprima o resultado do quadrado desse número.

*/

/*

import java.util.Scanner;


// Exercício 1.

    public class secao02_fundamentos {
        public static void main (String [] args ) {

            Scanner leitor = new Scanner(System.in);

            int numero;

            System.out.print(" Informe o número inteiro: ");
            numero = leitor.nextInt();

            System.out.println("O número informado foi " + numero);

            leitor.close();


        }
    }






// Exercício 2.

    public class secao02_fundamentos {
        public static void main (String [] args ) {

            Scanner leitor = new Scanner(System.in);

            int valor1, valor2, valor3, somaTotal;




            System.out.print("Digite o primeiro valor:");
            valor1 = leitor.nextInt();

            System.out.print("Digite o segundo valor:");
            valor2 = leitor.nextInt();

            System.out.print("Digite o terceiro valor:");
            valor3 = leitor.nextInt();

            somaTotal = valor1 + valor2 + valor3;

            System.out.println("A Soma dos valores informado são " + somaTotal);


            leitor.close();


        }
    }








//Exercício 3.

    public class secao02_fundamentos{
        public static void main (String [] args){

            Scanner leitor = new Scanner(System.in);

            float real, quadrado;

            System.out.print("Informe um valor real: ");
            real = leitor.nextFloat();

            quadrado = real * real;

            System.out.println("O quadrado de " + real + " é " + quadrado);

            leitor.close();

        }
    }




//Ciclo 11 	RESUMOS BREVES E FINALIZAÇÃO DA SEÇÃO 2


 */


