package io.github.murilowisch.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository todoRepository) {
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        return repository.save(novoTodo);
    }
    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
    }
    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
