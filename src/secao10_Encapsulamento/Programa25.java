package secao10_Encapsulamento;

public class Programa25 {
    public static void main (String [] args ) {

        Cliente joao = new Cliente("João da silva ", "Rua da paz, 45");
        Cliente maria = new Cliente("Maria da silva ", "Rua da paz, 45");



        Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
        Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria);


        System.out.println("Saldo do João (antes do saque): " + conta_joao.getSaldo());
        System.out.println("Saldo da Maria: " + conta_maria.getSaldo());


        conta_joao.sacar(300);
        System.out.println("Saldo do João (depois do saque): " + conta_joao.getSaldo());

    }
}


