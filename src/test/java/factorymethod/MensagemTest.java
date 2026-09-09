package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensagemTest {
    @Test
    void deveRetornarExcecaoParaTipoMensagemInexistente() {
        try{
            IMensagem mensagem = MensagemFactory.obterMensagem("FAX");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Tipo de mensagem não encontrado!", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMensagemEmailInvalido() {
        try {
            IMensagem mensagem = MensagemFactory.obterMensagem("Wpp");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de mensagem inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarInstanciaDoTipoCorreto() {
        IMensagem email = MensagemFactory.obterMensagem("Email");
        assertTrue(email instanceof MensagemEmail);

        IMensagem sms = MensagemFactory.obterMensagem("SMS");
        assertTrue(sms instanceof MensagemSMS);
    }

    @Test
    void deveRetornarExcecaoParaMensagemNula() {
        try {
            MensagemFactory.obterMensagem(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de mensagem não encontrado!", e.getMessage());
        }
    }
}