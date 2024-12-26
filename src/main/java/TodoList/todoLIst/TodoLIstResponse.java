package TodoList.todoLIst;

public record TodoLIstResponse(Long id,
                               String title,
                               String contents,
                               String etcMemo,
                               boolean completed) {
}
