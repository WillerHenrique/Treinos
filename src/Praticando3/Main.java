package Praticando3;

public class Main {
    public static void main (String [] args) {
        Carro carroA = new Carro();
        carroA.modelo = "Fiat / Uno";
        carroA.ano = 2020;
        carroA.motor = 2.0f;

        Carro carroB = new Carro();
        carroB.modelo = "Ford / Ka";
        carroB.ano = 2018;
        carroB.motor = 1.0f;

        System.out.println("O carro " + carroA.modelo + " é do ano " + carroA.ano + " e seu motor é " + carroA.motor);
        System.out.println("O carro " + carroB.modelo + " é do ano " + carroB.ano + " e seu motor é " + carroB.motor);
    }
}
