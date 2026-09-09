package factorymethod;

public class MensagemFactory {
    public static IMensagem obterMensagem(String mensagem) {
        Class classe = null;
        Object objeto = null;

        try{
            classe = Class.forName("factorymethod.Mensagem" + mensagem);
            objeto = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Tipo de mensagem não encontrado!");
        }
        if (!(objeto instanceof IMensagem)) {
            throw new IllegalArgumentException("Tipo de mensagem inválida");
        }

        return (IMensagem) objeto;
    }
}
