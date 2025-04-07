package br.com.cbritodev;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Calculadora media = new Calculadora();
        Mensagens mensagem = new Mensagens();
        EntradaDados notas = new EntradaDados(scanner);

        mensagem.mostraMensagens("**************");
        mensagem.mostraMensagens("Bem vindo(a) à br.com.cbritodev.Calculadora de médias da EBAC!");

        notas.leituraNotas(media);
        media.calcularMedia();
        double resultadoMedia = media.getMedia();
        mensagem.mostraMensagens("O valor da média é: " + resultadoMedia);
    }
}