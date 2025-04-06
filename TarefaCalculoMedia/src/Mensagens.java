public class Mensagens {

    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String mostraMensagens(String mensagem){
        System.out.println(mensagem);
        return mensagem;
    }

    public void mensagemIntroducao(){
        mostraMensagens("**************");
        mostraMensagens("Bem vindo(a) à Calculadora de médias da EBAC!");
    }
}
