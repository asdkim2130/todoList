package TodoList.todoLIst;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoListRestController {

    private TodoListService todoListService;

    //생성자
    public TodoListRestController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @PostMapping("/todos")
    public TodoList createTodoList(@RequestBody TodoLIstResponse todoLIstResponse){
        return todoListService.createTodoList(
                todoLIstResponse.title(),
                todoLIstResponse.contents(),
                todoLIstResponse.etcMemo(),
                todoLIstResponse.completed()
        );


    }

    @GetMapping("/todos")
    public List<TodoList> getTodoList(){
        return todoListService.readTodoList();
    }

    @PutMapping("/todos/{id}")
    public TodoList updateTodoList(@RequestBody TodoLIstResponse todoLIstResponse){
        return todoListService.updateTodoList(
                todoLIstResponse.id(),
                todoLIstResponse.title(),
                todoLIstResponse.contents(),
                todoLIstResponse.etcMemo(),
                todoLIstResponse.completed()
        );
    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodoList (@PathVariable TodoLIstResponse id){
        todoListService.deleteTodoList(id);
    }
}
