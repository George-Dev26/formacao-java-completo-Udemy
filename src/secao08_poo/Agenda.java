package secao08_poo;

import java.util.ArrayList;

//                          EXERCÍCIO 2
/*
2. Crie uma classe Agenda que pode armazenar contatos, podendo realizar as seguintes
operações:
- void armazenarContato(Contato contato);
- void removeContato(Contato contato);
- int buscaContato(String nome); // Informa em que posição da agenda está o contato.
- void imprimeAgenda(); // Imprime os dados de todos os contatos da agenda.
- void imprimeContato(int index); // Imprime os dados do contato que está no índice informado.


 */

public  class Agenda {

        ArrayList<Contato> contato = new ArrayList<Contato>();

        void armazenarContato(Contato contato) {
            this.contato.add(contato);
        }

        void removeContato(Contato contato) {
            this.contato.remove(contato);
        }

        int buscaContato(String nome) {
            for (int i = 0; i < contato.size(); i++) {
                if (contato.get(i).getNome() == nome) {
                    return i;
                }
            }
            return -1;
        }

        void imprimeAgenda() {
            System.out.println("===========AGENDA===========");
            for (Contato contato : contato) {
                contato.imprimir();
            }
            System.out.println("===========FIM============");
        }

        void imprimeContato(int index) {
            contato.get(index).imprimir();

        }
    }
