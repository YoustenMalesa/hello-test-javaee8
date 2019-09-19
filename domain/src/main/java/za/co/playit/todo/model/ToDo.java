package za.co.playit.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor
public class ToDo {
    private Long id;
    private String task;
    private LocalDate dateCreated;
    private LocalDate dueDate;
    private LocalDate dateCompleted;
    private Boolean isCompleted;
}
