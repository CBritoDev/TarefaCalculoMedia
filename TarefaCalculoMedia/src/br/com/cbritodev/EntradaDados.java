package br.com.cbritodev;

import java.util.Scanner;

public class EntradaDados {
    private Scanner scanner;

    public EntradaDados(Scanner scanner){
        this.scanner = scanner;
    }

    public void leituraNotas(Calculadora notas){
        System.out.print("Digite a primeira nota: ");
        notas.setNota1(scanner.nextDouble());

        System.out.print("Digite a segunda nota: ");
        notas.setNota2(scanner.nextDouble());

        System.out.print("Digite a terceira nota: ");
        notas.setNota3(scanner.nextDouble());

        System.out.print("Digite a quarta nota: ");
        notas.setNota4(scanner.nextDouble());
    }
}
