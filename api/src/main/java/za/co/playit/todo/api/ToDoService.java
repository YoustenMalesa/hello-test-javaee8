package za.co.playit.todo.api;
import za.co.playit.todo.entity.ToDo;

import java.util.List;

public interface ToDoService {
    ToDo addToDO(ToDo toDo);
    ToDo updateToDo(ToDo toDo);
    List<ToDo> getAllToDos();
    ToDo getToDoById(Long id);
    ToDo markToDoAsCompleted(Long id);
}
