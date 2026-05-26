package secao08_poo;

//                      SEÇÃO 08:  PROGRAMAÇÃO ORIENTADA A OBJETOS

//Ciclo 43:     O que é Orientação a Objetos ?
/*

                Orientação a Objetos:

        ========================================================
        =						                               =
        =         ===============			                   =
        =	      =    PRODUTO  =  			                   =
        =	      = nome        =			                   =
        =         = preço       = <======= Classe = Molde      =
        =         = desconto    =			                   =
        =         =             =			                   =
        =         ===============			                   =
        =     						                           =
        =						                               =
        =    =============    =============                    =
        =    = Notebook  =    = Caneta BIC=		               =
        =    =R$2.300,00 =    =  R$2,94   =		               =
        =    =    15%    =    =    5%     =                    =
        =    =============    =============                    =
        =                               		               =
        =	        Objetos Instanciados.	                   =
        ========================================================


//==========================================================


 */
// Ciclo 44:  Classes

// o nome das Clases inicia com eltra Maiúscula; não deve ter caracteres especiais etc...
// e dentro de uma classe Java não existe o main(o main numa classe Java é apenas um programa)

//public class Produto {
//}


//==========================================================

// Ciclo 45: Atributos
/*
 - São caracteristicas da classe/molde/modelo de dados;
 - Podemos entender Atributos como variáveis da classe;
 - Uma outra forma de nomenclatura para os atributos são estados;
 - Atributos são nomeados em letras minúsculas, sem espaçoes, sem caracteres especiais, sem ascentuação;


 */


//==========================================================

// Ciclo 46: Métodos
/*
 - Podemos entender os métodos como a ação que é realizada por um objeto da classe;
 - Podemos entender que os métodos são comportamentos dos objetos da classe;
 - Mesmo argumento de função: Uma função deve ter o seguinte:
a) Tipo de retorno.
b) nome;
c) Parâmetros/Argumentos de entrada (opcional)
d) Retorno (opcional - depende do tipo de retorno)



public class Produto {

    String nome;
    float preco, desconto;

// Método para aumentar o preço do projeto em 10
    void aumentar_preco(float valor){
        this.preco = this.preco + valor;
    }
}



 */


//==========================================================

// Ciclo 47:  Objetos
// - Obejtos são produtos/instâncias da classe;

        public class conteudo_Poo {

            static public class Produto {

                String nome;
                float preco, desconto;

                static public class Pessoa {

                    String nome, email;
                    int ano_nascimento;



                    public static void main(String[] args) {

                int numero = 4;

                Produto p0;
                Produto p1 = new Produto();
                p1.nome = "Notebook";
                p1.preco = 2.367f;
                p1.desconto = 15.0f;

                System.out.println("============= Produtos =============");
                System.out.println(p1.nome);
                System.out.println("R$ " + p1.preco);
                System.out.println(p1.desconto + "%");

                p0 = new Produto();
                p0.nome = "Caneta Bic";
                p0.preco = 2.45f;
                p0.desconto = 5;

                System.out.println(p0.nome);
                System.out.println("R$ " + p0.preco);
                System.out.println(p0.desconto + "%");

                Pessoa pessoa1 = new Pessoa();
                pessoa1.nome = "Angelina jolie";
                pessoa1.email = "jolie@gmail.com";
                pessoa1.ano_nascimento = 1976;

                System.out.println("=================== Pessoas =============");
                System.out.println("Nome: " + pessoa1.nome);
                System.out.println("E-mail: " + pessoa1.email);
                System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);

            }
        }
    }
}



//==================================================================================

/*
// Ciclo 48:  Construtor


// - O construtor da classe Sempre tem o mesmo nome da classe;
// - Podemos ter mais de um na classe;
// - Por padrão, a JVM - Java Virtual Machine, cire em tompo de execução, um construtor padrão - vazio

public class conteudo_Poo {
    public static class Pessoa {

        String nome, email;
        int ano_nascimento;


        public Pessoa() {
        }

        public Pessoa(String nome, String email, int ano_nascimento) {

            this.nome = nome; // this = este objeto.
            this.email = email;
            this.ano_nascimento = ano_nascimento;

        }

        void imprime_informacoes() {
            System.out.println("Nome: " + this.nome);
            System.out.println("E-mail: " + this.email);
            System.out.println("Ano de Nascimento: " + this.ano_nascimento);

        }


            public static void main(String[] args) {

                 Pessoa pessoa1 = new Pessoa(); // (Método) Contrutor

                pessoa1.nome = "Felicity Hone";
                pessoa1.email = "felicity@gmail.com";
                pessoa1.ano_nascimento = 1986;


                pessoa1.imprime_informacoes();

                Pessoa pessoa2 = new Pessoa("Angelina julie", "jolie@gmail.com", 1976);

                pessoa2.imprime_informacoes();


            }

        }

    }



 */

