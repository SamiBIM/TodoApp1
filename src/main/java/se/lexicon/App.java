package se.lexicon;

import java.time.LocalDate;

public class App 
{


    public static void main( String[] args )
    {

        Person p1 = new Person();
        p1.setFirstName("Sami");
        p1.setLastName("Burhan");
        p1.setEmail("s.b@gmail");
        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("Cook");
        todoItem.setDeadLine(LocalDate.now().plusDays(1));
        todoItem.setCreator(p1);
        System.out.println(todoItem.getSummary());
        System.out.println(todoItem.isOverdue());

        TodoItemTask todoItemTask = new TodoItemTask();
        todoItemTask.setAssignee(p1);
        todoItemTask.setAssigned(false);
        System.out.println(todoItemTask.getSummary());
        System.out.println(todoItemTask.isAssigned());



    }
}


