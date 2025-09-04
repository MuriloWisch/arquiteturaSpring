package io.github.murilowisch.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
    public void envian(String mensagem){
        System.out.println("Enviado email: " + mensagem);
    }
}
