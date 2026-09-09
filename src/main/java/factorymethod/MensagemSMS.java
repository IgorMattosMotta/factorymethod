package factorymethod;

public class MensagemSMS implements IMensagem {
    @Override
    public String enviarMensagem() {
        return "Mensagem enviado com sucesso pelo SMS!";
    }
}
