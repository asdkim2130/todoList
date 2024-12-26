package TodoList.todoLIst;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String contents;
    private String etcMemo;
    private boolean completed;

    public TodoList(){}

    // 생성자
    public TodoList(String title, String contents, String etcMemo, boolean completed) {
        this.title = title;
        this.contents = contents;
        this.etcMemo = etcMemo;
        this.completed = completed;
    }


    //getter

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public String getEtcMemo() {
        return etcMemo;
    }

    public boolean isCompleted() {
        return completed;
    }
}
