//        SEÇÃO 05: TIPOS DE DADOS EM JAVA

// Ciclo 24     Tipos Númericos - Parte 1
// Ciclo 25   Tipos numéricos - Parte 2
// Números inteiros e reais
/*

public class Programa11 {
    public static void main ( String [] args ) {
// Tipos primarios
        long num0 = 99;
        int num1 = 4;
        short num2 = 4;
        byte num3 = 4;
        char num8 = 35;

// Tipos não primarios
        Integer num4 = 98;
        Short num5 = 7;
        Byte num6 = 9;
        Long num7 = 999999L; // Cast
        Character num9 = 35;


// Chamando cada um para verificar como estão sendo alocados
        System.out.println(" long -> Num0 = " + num0);
        System.out.println(" int -> Num1 = " + num1);
        System.out.println(" short -> Num2 = " + num2);
        System.out.println(" byte -> Num3 = " + num3);
        System.out.println(" Integer -> Num4 = " + num4);
        System.out.println(" Short > Num5 = " + num5);
        System.out.println(" Byte -> Num6 = " + num6);
        System.out.println(" Long -> Num7 = " + num7);
        System.out.println(" Character -> Num9 = " + num9);

// Verificando quanto de Bytes consome cada um
        System.out.println("long/Long " + Long.SIZE + " bits");
        System.out.println("int/Integer " + Integer.SIZE + " bits");
        System.out.println("short/Short " + Short.SIZE + " bits");
        System.out.println("byte/Byte " + Byte.SIZE + " bits");
        System.out.println("char/Character " + Character.SIZE + " bits");

// Verificando quanto chega cada um no MIN e no MAX
        System.out.println("Valor Min char/Character " + Character.MIN_VALUE);
        System.out.println("Valor Max char/Character " + Character.MAX_VALUE);

        System.out.println("Valor Min long/Long " + Long.MIN_VALUE);
        System.out.println("Valor Max long/Long " + Long.MAX_VALUE);

        System.out.println("Valor Min int/Integer " + Integer.MIN_VALUE);
        System.out.println("Valor Max int/Integer " + Integer.MAX_VALUE);

        System.out.println("Valor Min short/Short " + Short.MIN_VALUE);
        System.out.println("Valor Max short/Short " + Short.MAX_VALUE);

        System.out.println("Valor Min byte/Byte " + Byte.MIN_VALUE);
        System.out.println("Valor Max byte/Byte " + Byte.MAX_VALUE);


    }
}


//		Números Reais

public class Programa12 {
    public static void main ( String [] args ) {

// Tipos primarios/primitivos
// Por padrão, os números reais em Java são considerados double
        float preco1 = 23.4f;  // diferença: 23.40
        double preco2 = 23.4;  // diferença: 23.4626546615468546


// Tipos não primarios/primitivos
        Float preco3 = 44.5f;
        Double preco4 = 44.5;

        System.out.println("float -> preco1 = " + preco1);
        System.out.println("fouble -> preco2 = " + preco2);
        System.out.println("Float -> preco3 = " + preco3);
        System.out.println("Double -> preco4 = " + preco4);

         System.out.println("float/Float " + Float.SIZE + " bits");
         System.out.println("double/Double " + Double.SIZE + " bits");

         System.out.println("Valor Min float/Float " + Float.MIN_VALUE);
         System.out.println("Valor Max float/Float " + Float.MAX_VALUE);

         System.out.println("Valor Min double/Double " + Double.MIN_VALUE);
         System.out.println("Valor Max double/Double " + Double.MAX_VALUE);



    }
}






//==============================================================================

//Ciclo 26  Tipos Alfanuméricos
// Caracteres e Strings


public class Programa13{
    public static void main(String[] args) {

// Tipos primitivos
   char letra = 'a';
   char letra2 = 97;  // 97 em decimal == 'a'
// char letra4 = "b"; ERRADO
// String nom = "adads"; Não existe o tipo primitivo string
    System.out.println("Letra2 " + letra2);

    letra2 = (char) (letra2 + 1); //cast

   System.out.println("Letra " + letra);
   System.out.println("Letra2 " + letra2);

// Tipos não primitivos
   Character letra3 = 'A';
   String nome = "Geek University";

   System.out.println("Letra3 " + letra3);

        System.out.println("char/Character " + Character.SIZE + " bits");

        System.out.println("Valor Min char/Character " + Character.MIN_VALUE);
        System.out.println("Valor Max char/Character " + Character.MAX_VALUE);

        System.out.println("Nome " + nome);
        System.out.println("Tamanho da String: " + nome.length());

       System.out.println("String " + (Character.SIZE * nome.length()) + " bits");// Só consigo ver quanto de bytes existe atravez desse comando, pois na teoria não existe bytes para String
    }
}


//==============================================================================

// Ciclo 27  Tipos booleanos

public class Programa14 {
    public static void main(String[] args) {

    // Tipos primitivos

    boolean verdadeiro = true;
    boolean falso = false;


    // Tipos não primitivos

    Boolean v = true;
    Boolean f = false;

    boolean ativo = false;

    System.out.println("Verdadeiro " + verdadeiro);
    System.out.println("Falso " + falso);
    System.out.println("V " + v);
    System.out.println("F " + f);

    if (verdadeiro){
        System.out.println("Verdadeiro");
    } else {
        System.out.println("É Falso");
    }

    if ( 1 == 1)  {
        System.out.println("1 == 1 É Verdadeiro ");
    } else {
        System.out.println("É Falso");
    }
    if (ativo){
        System.out.println("Pode acessar o sistema.");
    } else {
        System.out.println("Acesso Negado");
    }

    }
}


//==============================================================================


// Ciclo 28  Operações Matemáticas

public class Programa15 {
    public static void main(String[] args) {

    int num1 = 5, num2 = 9, res;
    float res2;


    //soma
    res = num1 + num2;

    System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);

    //Subtração
    res = num2 - num1;
    System.out.println("A Subtração de " + num1 + " - " + num2 + " é " + res);

    //Multiplicação
    res = num1 * num2;
    System.out.println("A Multiplicação de " + num1 + " * " + num2 + " é " + res);

    //Divisão Inteira
    res = num1 / num2;
    System.out.println("A Divisão de " + num2 + " / " + num1 + " é " + res);

    //Divisão Real
    res2 =  (float)num2 / (float)num1; // cast
    System.out.println("A Divisão de " + num2 + " / " + num1 + " é " + res);

    //Modulo
    // Se o resto do Módulo da varioável por 2 for 0, a variável é par. Se o resto for 1, a variável é impar
    res = num1 % 2;
    System.out.println("O resto da divisão de " + num1 + " por 2 é " + res);

    res = num2 % 3;
    System.out.println(num2 + " é divisível por 3? " + res);


    }
}





 */



















