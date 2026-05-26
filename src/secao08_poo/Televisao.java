package secao08_poo;

//                              EXERCÍCIO 03
/*
3. Crie uma classe Televisão e uma classe ControleRemoto que pode controlar a televisão,
como ligar e desligar, trocar canais e aumentar e diminuir o volume.
- O controle de volume permite aumentar ou diminuir a potência do volume de som em uma unidade de cada vez.
- O controle de canal permite aumentar ou diminuir o número do canal em uma unidade, porém também possibilita
trocar para um canal indicado.
 */


public class Televisao {

    ControleRemoto controle = new ControleRemoto();
    int canal = 1, volume = 1;
    boolean ligada = false;

    void liga_desliga (){
        this.ligada = this.controle.liga_desliga(this.ligada);

        if(this.ligada) {
            System.out.println("A TV foi ligada...");
        } else {
            System.out.println("A TV foi desligada...");
        }
    }

    void diminuir_volume () {
        this.volume = this.controle.diminuir_volume(this.volume);

        System.out.println("- Volume atual: " + this.volume);
    }

    void aumentar_volume (){
        this.volume = this.controle.aumentar_volume(this.volume);

        System.out.println("+ Volume atual: " + this.volume);
    }


    void diminuir_canal () {
        this.canal = this.controle.diminuir_canal(this.canal);

        System.out.println("- Canal atual: " + this.canal);
    }

    void aumentar_canal (){
        this.canal = this.controle.aumentar_canal(this.canal);

        System.out.println("+ Canal atual: " + this.canal);
    }

    void mudar_canal(int canal){
        this.canal = this.controle.mudar_canal(canal);

        System.out.println("Mudar Canal atual: " + this.canal);
    }

}

