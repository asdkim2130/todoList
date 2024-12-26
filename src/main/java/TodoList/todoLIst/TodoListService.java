package TodoList.todoLIst;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TodoListService {

    private TodoListRepository todoListRepository;


    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    // Create
    public TodoList createTodoList(String title, String contests, String etcMemo, boolean completed){
        TodoList todoList = new TodoList("title", "contents", "memo", false);
        return todoListRepository.save(todoList);
    }

    // Read
    public List<TodoList> readTodoList(){
        return todoListRepository.findAll();
    }

    public TodoList updateTodoList(Long id, String title, String contents, String etcMemo, boolean completed){
        TodoList todoList = todoListRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 to-do를 찾지 못했습니다."));

        TodoList todoList2 = new TodoList(
                title,
                contents,
                etcMemo,
                completed);


        return todoListRepository.save(todoList2);

    }

    public void deleteTodoList(TodoLIstResponse todoLIstResponse){
        todoListRepository.deleteById(todoLIstResponse.id());
    }

}
