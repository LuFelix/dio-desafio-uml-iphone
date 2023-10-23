package iphone.main;

import iphone.implementacao.IPhone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Start {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        IPhone ip = new IPhone();
        System.out.println("Olá Bem vindo ao IPhone!");
        ip.selecionarMusica();
        ip.aumentarVolume();

    }
}