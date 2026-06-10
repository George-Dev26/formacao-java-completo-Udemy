package secao10_Encapsulamento;

public class Programa27 {
    public static void main (String [] args ) {

        Cliente cli1 = new Cliente ("Felicity Jones", "Rua eliopoles 123");

        System.out.println("Nome: " + cli1.getNome());
        System.out.println("Endereço: " + cli1.getEndereco());


        Cliente cli2 = new Cliente("Angelina jolie", "rua ananias 123");

        System.out.println("Nome: " + cli2.getNome());
        System.out.println("Endereço: " + cli2.getEndereco());

    }
}
