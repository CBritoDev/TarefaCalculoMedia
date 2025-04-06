import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Calculadora media = new Calculadora();
        Mensagens mensagem = new Mensagens();

        mensagem.mensagemIntroducao();
        media.leituraNotas();
        media.calculadoraMedia();
        double resultadoMedia = media.getMedia();
        System.out.print("O valor da média é: " + resultadoMedia);
    }
}