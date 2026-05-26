package secao08_poo;

public class Exercicio02 {
        public static void main(String[] args) {

            Agenda agenda = new Agenda();

            Contato contato1 = new Contato();
            contato1.setNome("Felicity Jones");
            contato1.setEmail("Felicity@gmail.com");
            contato1.setTelefone("555-8765");
            Contato contato2 = new Contato();
            contato2.setNome("Angelina julie");
            contato2.setEmail("angelina@gmail.com");
            contato2.setTelefone("888-9780");
            Contato contato3 = new Contato();
            contato3.setNome("Ray Sychev");
            contato3.setEmail("ray@gmail.com");
            contato3.setTelefone("999-7856");


            agenda.armazenarContato(contato1);
            agenda.armazenarContato(contato2);
            agenda.armazenarContato(contato3);

            agenda.imprimeAgenda();

            agenda.imprimeContato(2); // Ray

            System.out.println(agenda.buscaContato("Angelina Jolie")); //1

            agenda.removeContato(contato3);

            agenda.imprimeAgenda();
        }
    }

