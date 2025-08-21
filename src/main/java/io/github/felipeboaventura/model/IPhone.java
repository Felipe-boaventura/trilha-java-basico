package io.github.felipeboaventura.model;

import io.github.felipeboaventura.service.AparelhoTelefonico;
import io.github.felipeboaventura.service.Navegador;
import io.github.felipeboaventura.service.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, Navegador, ReprodutorMusical {

    public void tocar() { System.out.println("Tocando música..."); }
    public void pausar() { System.out.println("Música pausada."); }
    public void selecionarMusica(String musica) { System.out.println("Selecionando: " + musica); }

    public void ligar(String numero) { System.out.println("Ligando para " + numero); }
    public void atender() { System.out.println("Atendendo chamada..."); }
    public void iniciarCorreioDeVoz() { System.out.println("Iniciando correio de voz..."); }

    public void exibirPagina(String url) { System.out.println("Exibindo página: " + url); }
    public void adicionarNovaAba() { System.out.println("Nova aba adicionada."); }
    public void atualizarPagina() { System.out.println("Página atualizada."); }

}
