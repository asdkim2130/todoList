package TodoList.todoLIst;

public record TodoListRequest(String title,
                              String contents,
                              String etcMemo,
                              boolean completed) {
}
