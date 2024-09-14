package se.lexicon.DAO;

import se.lexicon.Model.Person;
import se.lexicon.Model.TodoItem;

import java.util.Collection;

public interface TodoItemsDAO {

    public TodoItem create(TodoItem todo);

    public Collection<TodoItem> findAll();

    public TodoItem findById(int id);

    public Collection<TodoItem> findByDoneStatus(boolean status);

    public Collection<TodoItem> findByAssignee(int id);

    public Collection<TodoItem> findByAssignee(Person person);

    public Collection<TodoItem> findByUnassignedTodoltems();

    public TodoItem update(TodoItem todo);

    public boolean deleteById(int id);
}
