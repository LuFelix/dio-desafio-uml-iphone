package iphone.implementacao;

import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;
import iphone.interfaces.Telefone;
import java.io.File;
import java.net.URL;

public class IPhone implements NavegadorInternet, ReprodutorMusical, Telefone {
    /**
     * Reproduz um item da biblioteca
     */
    public void tocar(File file) {
        System.out.println("Tocando Música");
    }

    /**
     * Pausa a execução do arquivo
     */
    public void pausar() {
        System.out.println("Reprodutor Pausado");
    }

    /**
     * Seleciona uma musica
     */
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    /**
     *Aumenta o volume
     */
    public void aumentarVolume() {
        System.out.println("Aumentando o volume");
    }

    /**
     * @param numero Realiza uma chamada
     */
    @Override
    public void ligar(int numero) {
        System.out.println("Chamando..... ");
    }

    /**
     * Atende uma chamada
     */
    @Override
    public void atender() {
        System.out.println("Atendendo Chamada...");
    }

    /**
     * @param numero Realiza uma chamada para o correio de voz
     */
    @Override
    public void iniciarCorreioVoz(int numero){
        System.out.println("Chamando correio de voz...");
    }

    /**
     * Direciona o audio da chamada para o viva voz
     */
    @Override
    public void mudarParaVivaVoz() {
        System.out.println("Mudando para viva voz");
    }

    /**
     * Alterna entre duas chamadas ativas
     */
    @Override
    public void alternarChamada() {
        System.out.println("Alternando entre chamadas...");
    }

    /**
     * @param url Exibe a página da url recebida
     */
    @Override
    public void exibirPagina(URL url) {
        System.out.println("Exibindo página");
    }

    /**
     * Adiciona uma nova aba à janela ativa
     */
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba...");
    }

    /**
     *  Atualiza a página ativa
     */
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    /**
     * Salva uma url nos favoritos
     */
    @Override
    public void adicionarFavorito(URL url) {
        System.out.println("Adicionando nos favoritos...");
    }
}
