//              SEÇÃO 07:  FUNÇÕES EM JAVA

/*
Faça um programa, que receba diversos nomes de frutas do usuário e no final
imprima essas frutas em ordem contrária. O programa deve solicitar ao usuário
quantas frutas ele quer informar.



// Ciclo 38/39:    Criando Funções e Usando elas
import java.util.Scanner;

public class secao07 {
//Variávle global
   static String frutas[];
   static Scanner leitor = new Scanner(System.in);


    public static void main(String[] args) {
// Variável Local
        int qtd;

System.out.print("Informe a quantidade de frutas para cadastrar: ");
qtd = Integer.parseInt(leitor.nextLine());

cadastrar_dados(qtd);
mostrar_dados(qtd);


/* Uma função deve ter o seguinte:
a) Tipo de retorno.
b) nome;
c) Parâmetros/Argumentos de entrada (opcional)
d) Retorno (opcional - depende do tipo de retorno)

void == vazio


    }
    static void cadastrar_dados(int quantidade){

        frutas = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {

            System.out.print("Informe a " + (i + 1) + " fruta:");
            frutas[i] = leitor.nextLine();
        }

    }
    static void mostrar_dados(int quantidade){
        for(int i = (quantidade - 1); i >= 0; i--){
            System.out.println(frutas[i]);
        }
leitor.close();

    }
}

//================================================================

// Ainda sobre Funções

public class Programa21 {
    public static void main(String[] args) {
        int valor1 = 6, valor2 = 4;


        System.out.println("O resultado é " + soma(valor1, valor2, "olá"));
        System.out.println(mensagem());

    }
static int soma(int v1, int v2, String msg){
        return v1 + v2;
}
static String mensagem(){
        return "olá usuário";
}

}




 */






//====================================================================
/*

//              EXERCÍCIOS PARA PRÁTICAR

//1- Faça um programa que possua uma função que recebe como parâmetro um número inteiro e devolve o dobro

public class Exercicio1{

  static int dobro(int numero){
      return numero * 2;
  }


    public static void main(String[] args) {

    System.out.println(dobro(5));


    }
}



//==============================================================================


//                      EXERXPICIO 2
//2- Faça um programa que receba a data atual (dia, mês e ano) e exibe na tela no formato textual.
//Exemplo: data 01/05/2026, imprimir: 1 de maio de 2026

public class Exercicio2{
    static String data_texto(String data){
        String[] partes = data.split("/");
     String mex_txt = "";

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if(mes == 1){
            mex_txt = "Janeiro";
        } else if(mes == 2) {
            mex_txt = "Fevereiro";
        }else if(mes == 3) {
            mex_txt = "Março";
        }else if(mes == 4) {
            mex_txt = "Abril";
        }else if(mes == 5) {
            mex_txt = "Maio";
        }else if(mes == 6) {
            mex_txt = "Junho";
        }else if(mes == 7) {
            mex_txt = "Julho";
        }else if(mes == 8) {
            mex_txt = "Agosto";
        }else if(mes == 9) {
            mex_txt = "Setembro";
        }else if(mes == 10) {
            mex_txt = "Outubro";
        }else if(mes == 11) {
            mex_txt = "Novembro";
        }else if(mes == 12) {
            mex_txt = "Dezembro";
        }

        return dia + " de " + mex_txt + " de " + ano;
    }


    public static void main(String[] args) {
    System.out.println(data_texto("01/05/2026"));
    System.out.println(data_texto("09/10/2002"));


    }
}



//=====================================================================================


//                  EXERCÍCIO 3
//3- Escreva um programa que tenha uma função que recebe dois valores inteiros e retorna o maior.
public class Exercicio3{

    static int maior(int valor1, int valor2) {
        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }
    public static void main(String[] args) {

    System.out.println(maior(21, 42));
    System.out.println(maior(56, 42));
    System.out.println(maior(27, 27));



    }
}




 */