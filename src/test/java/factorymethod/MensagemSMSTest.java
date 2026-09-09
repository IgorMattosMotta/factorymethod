package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensagemSMSTest {
    @Test
    void deveRetornarSMSEnviado() {
        try {
            IMensagem mensagem = MensagemFactory.obterMensagem("SMS");
            assertEquals("Mensagem enviado com sucesso pelo SMS!", mensagem.enviarMensagem());
        }catch (IllegalArgumentException e){

        }
    }
}
