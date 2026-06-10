package secao10_Encapsulamento;

public class Conta {
    int numero;
    private float saldo; // Privado conforme o conceito de Encapsulamento
    float limite;
    Cliente cliente;

// Construtor
    public Conta (int numero, float saldo, float limite, Cliente cliente) {

        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

// Método Sacar com Lógica ajustada
    public void sacar(float valor) {

        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;

        } else if (valor <= (this.saldo + this.limite)) {

            float val_ret = valor - this.saldo; // Para calcular o restante que sairá do limite
            this.saldo = 0;
            this.limite = this.limite - val_ret; // Atualiza o limite restante


        } else {
            System.out.println("Saldo insuficiente");
        }
    }

        public void depositar (float valor) {
            this.saldo = this.saldo + valor;

        }

// método getter do atributo saldo
       public float getSaldo() {
            return this.saldo + this.limite;
        }
    }
