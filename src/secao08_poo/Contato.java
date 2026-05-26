package secao08_poo;


//                              EXERCÍCIO PARA PRÁTICAR 01
/*
1. Crie uma classe para representar um contato, com os atributos privados de nome, email e
telefone. Crie os métodos públicos necessários para sets e gets e também um método para
imprimir os dados de uma pessoa. Crie também um programa, instancie um objeto desta classe
e imprima os dados do objeto


 */

    public class Contato {

        private String nome, email, telefone;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public void imprimir() {
            System.out.println("Nome: " + this.nome);
            System.out.println("email: " + this.email);
            System.out.println("telefone: " + this.telefone);
        }

    }

