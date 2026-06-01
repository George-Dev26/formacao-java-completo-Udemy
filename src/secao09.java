// 		            	SEÇÃO 09:  PACOTES


/*

 No Java, um Package (pacote) é o equivalente a pastas ou dire
tórios do sistema operacional do seu computador. A função princi
pal dele é organizar as suas classes e arquivos de código de for
ma estruturada e lógica.

 A medida que o seu portfólio e os seus projetos (como o de Banco
ou Mercado) começam a crescer, colocar todas as classes em um lu
gar só vira um caos. Os pacotes resolvem isso.

 As 3 principais Funções dos Packages

1. Orgaização e Separação de Responsabilidades: Permite agrupar
classes que fazem coisa parecida. Você pode ter um pacote para
a interface com o usuário, outro para as regras de negócio e
outro para os testes.

2. Prevenção de Conflitos de Nomes: No Java, você não pode ter
duas classes com o mesmo nome na mesma pasta. Com pacotes, você
pode ter uma classe Util no pacote br.com.banco.sistema e outra
classe Util no pacote br.com.banco.seguranca sem nenhum problema.

3. Controle de Visibilidade (Encapsulamento): O Java possui modi
ficadores de acesso (como o protected ou o acess padrão "package-
private"). Isso significa que você pode criar classes ou métodos
que só podem ser vistos e usados por outras classes que estejam
dentro do mesmo pacote.

Como funciona no Código ?
 A primeira linha de um arquivo Java que está dentro de um pacote
deve obrigatoriamente declarar a qual pacote ee pertence, usando
a palavra-chave package:

package secao06_poo; // Esta linha dz ao Java onde o arquivo es
tá guardado


public class Contato {
  // Código da classe
}


 E se eu quiser usar uma classe que está em OUTRO pacote ?
Quando uma classe precisa interagir com outra que está guardada
num pacote diferente, você precisa usar o comando import logo
abaixo da declaração do pacote:


package secao07_testes; // Pacote atual

import secao06_poo.Contato; // Importando a classe Contato do
outro pacote



public class ExecutarTeste {
  public static void main (String[] args) {

  contato novoContato = new Contato(); // Agora o Java permite usar!
}
}




(NOTA: Se as classes estiverem dentro do mesmo pacote, o import
não é necessário, o Java já as encontra automaticamente).


 */



public class secao09{
    public static void main(String[] args) {

        System.out.println("ASSUNTO DA SEÇÃO 09: PACKAGE");
    }
}

















































