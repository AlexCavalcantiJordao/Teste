package teste;

import java.util.Random;

public class Teste {

    public static void main(String[] args) {
       
        Random aleatorio = new Random();
        float valor = aleatorio.nextFloat() * 100;
        System.out.println("Número gerado: " + valor);
        
    }
}