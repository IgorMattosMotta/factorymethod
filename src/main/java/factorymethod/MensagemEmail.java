package factorymethod;

public class MensagemEmail implements IMensagem {
    @Override
    public String enviarMensagem() {
        return "Mensagem enviado com sucesso pelo email!";
    }
}
