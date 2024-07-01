package org.example;


import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.Person;
import se.lexicon.TodoItem;
import se.lexicon.TodoItemTask;

/**
 * Unit test for simple App.
 */
public class AppTest {

    TodoItemTask todoItemTask;
    TodoItem todoItem;
    Person p1;

    @BeforeEach
    void setUp(){
        p1 = new Person();
        p1.setFirstName("Sami");
        p1.setLastName("Burhan");
        p1.setEmail("s.b@gmail");

        todoItem = new TodoItem();
        todoItem.setTitle("Cook");
        todoItem.setDeadLine(LocalDate.now().plusDays(1));
        todoItem.setCreator(p1);

        todoItemTask = new TodoItemTask();
        todoItemTask.setAssigned(false);
        todoItemTask.setAssignee(p1);
    }


    @Test
    void test1() {


        Assertions.assertTrue(todoItemTask.isAssigned());

    }

    @Test
    void test2(){

        Assertions.assertEquals("Cook", todoItem.getTitle());

    }
}
