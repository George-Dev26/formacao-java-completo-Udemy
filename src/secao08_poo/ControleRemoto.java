package secao08_poo;
//                              EXERCÍCIO 03
/*
3. Crie uma classe Televisão e uma classe ControleRemoto que pode controlar a televisão,
como ligar e desligar, trocar canais e aumentar e diminuir o volume.
- O Controle de volume permite aumentar ou diminuir a potência do volume de som em uma unidade de cada vez.
- O Controle de canal permite aumentar ou diminuir o número do canal em uma unidade, porém também possibilita
trocar para um canal indicado.
 */


public class ControleRemoto {
    boolean liga_desliga(boolean ligado){
        return !ligado;
    }

    int aumentar_volume( int volume ){
        return volume + 1;
    }

    int diminuir_volume(int volume){
        return volume -1;
    }

    int aumentar_canal(int canal){
        return canal + 1;
    }

    int diminuir_canal(int canal){
        return canal -1;
    }
    int mudar_canal(int canal){
        return canal;
    }

}