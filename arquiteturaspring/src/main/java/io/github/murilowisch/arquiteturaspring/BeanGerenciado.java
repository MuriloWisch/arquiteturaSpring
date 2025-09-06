package io.github.murilowisch.arquiteturaspring;

import io.github.murilowisch.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }
}
