package Praticando1;

public class Main {
    public static void main(String[] args) {
        Celular celularA = new Celular();
        celularA.nome = "Poco X3 PRO";
        celularA.espacoArmazenamento = 256;
        celularA.tamanhoTela = 6.67f;

        System.out.println("O celular " + celularA.nome + " tem " + celularA.espacoArmazenamento + "GB de armazenamento e possui a tela de " + celularA.tamanhoTela + " ''polegadas");

        Celular celularB = new Celular();
        celularB.nome = "Galaxy S20 FE";
        celularB.espacoArmazenamento = 256;
        celularB.tamanhoTela = 6.5f;

        System.out.println("O celular " + celularB.nome + " tem " + celularB.espacoArmazenamento + "GB de armazenamento e possui a tela de " + celularB.tamanhoTela + " ''polegadas");

    }
}