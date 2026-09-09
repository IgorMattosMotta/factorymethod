package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensagemEmailTest {
    @Test
    void deveRetornarEmailEnviado() {
        try {
            IMensagem mensagem = MensagemFactory.obterMensagem("Email");
            assertEquals("Mensagem enviado com sucesso pelo email!", mensagem.enviarMensagem());
        }catch (IllegalArgumentException e){

        }
    }
}
