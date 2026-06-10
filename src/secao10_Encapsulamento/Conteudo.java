package secao10_Encapsulamento;
/*
O Encapsulamento é um dos pilares da Programação Orientada a Objetos (POO) e serve para proteger e blindar os dados de uma classe,
escondendo os seus detalhes internos do mundo exterior.

Em termos simples: ele funciona como a carcaça de uma cápsula de remédio ou o painel de um carro.
Você interage com o botão (método público), mas não mexe diretamente nos fios e engrenagens lá dentro (atributos privados).

Como o Encapsulamento funciona no código Java?
Para aplicar o encapsulamento, você segue uma regra padrão de mercado baseada em dois passos essenciais:

Atributos Privados (private): Você esconde as variáveis da classe para que ninguém de fora consiga alterá-las ou lê-las diretamente de forma maliciosa ou errada.

        Métodos Públicos (get e set): Você cria "portas de entrada" controladas para permitir o acesso a esses atributos apenas se passarem pelas suas regras de validação.

Exemplo Prático: Sem Encapsulamento vs. Com Encapsulamento

 Sem Encapsulamento (Perigoso):

public class Conta {
    public double saldo; // Qualquer um pode vir aqui e quebrar o sistema
}

// No método main:
Conta c = new Conta();
c.saldo = -500.00; // Erro grave! O sistema aceitou um saldo negativo direto.


 Com Encapsulamento (Seguro e Profissional):

public class Conta {
    private double saldo; // Ninguém de fora enxerga diretamente

    // GET: Permite ler o saldo de forma segura
    public double getSaldo() {
        return this.saldo;
    }

    // SET: Permite alterar o saldo, mas aplicando uma VALIDAÇÃO
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor; // Só altera se o valor for positivo
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
}


As 3 Grandes Vantagens do Encapsulamento:

1. Segurança e Controle (Validação): A classe dita as próprias regras. O mundo externo só faz com o atributo o que o seu método set ou de negócio permitir.

2. Facilidade de Manutenção: Se amanhã a regra de como o saldo é calculado mudar, você só mexe dentro da classe Conta. O restante do sistema (seus arquivos Main) nem vai notar a diferença.

3. Abstração: Quem usa o seu objeto não precisa saber a matemática complexa que acontece por baixo dos panos; só precisa chamar o método e ver o resultado.


 */