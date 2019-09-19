package za.co.playit.todo.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@NamedQueries(
        @NamedQuery(name = "ToDo.findAllToDos", query = "SELECT t FROM ToDo t")
)
public class ToDo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "Task cannot be empty")
    private String task;
    private LocalDate dateCreated;
    private LocalDate dueDate;
    private LocalDate dateCompleted;
    private Boolean isCompleted;

    @PrePersist
    public void init() {
        this.setDateCreated(LocalDate.now());
    }
}
