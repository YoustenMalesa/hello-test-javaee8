package za.co.playit.api.impl;


import za.co.playit.todo.api.ToDoService;
import za.co.playit.todo.entity.ToDo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Stateless
public class ToDoServiceImpl implements ToDoService {
    @PersistenceContext(name = "test-pu")
    private EntityManager entityManager;


    @Override
    public ToDo addToDO(ToDo toDo) {
        entityManager.persist(toDo);
        return toDo;
    }

    @Override
    public ToDo updateToDo(ToDo toDo) {
        entityManager.merge(toDo);
        return toDo;
    }

    @Override
    public List<ToDo> getAllToDos() {
        return entityManager.createNamedQuery("ToDo.findAllToDos").getResultList();
    }

    @Override
    public ToDo getToDoById(Long id) {
        return entityManager.find(ToDo.class, id);
    }

    @Override
    public ToDo markToDoAsCompleted(Long id) {
        ToDo toDo = entityManager.find(ToDo.class, id);
        toDo.setIsCompleted(true);
        entityManager.merge(toDo);

        return toDo;
    }
}
