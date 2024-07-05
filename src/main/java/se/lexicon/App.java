package se.lexicon;

import java.time.LocalDate;

public class App 
{


    public static void main( String[] args )
    {

//        Person p1 = new Person();
//        p1.setFirstName("Sami");
//        p1.setLastName("Burhan");
//        p1.setEmail("s.b@gmail");
//        TodoItem todoItem = new TodoItem();
//        todoItem.setTitle("Cook");
//        todoItem.setDeadLine(LocalDate.now().plusDays(1));
//        todoItem.setCreator(p1);
//        System.out.println(todoItem.getSummary());
//        System.out.println(todoItem.isOverdue());
//
//        TodoItemTask todoItemTask = new TodoItemTask();
//        todoItemTask.setAssignee(p1);
//        todoItemTask.setAssigned(false);
//        System.out.println(todoItemTask.getSummary());
//        System.out.println(todoItemTask.isAssigned());

        Person p1 = new Person();
        AppUser user = new AppUser();
        AppUser user1 = new AppUser("Sami", "1234",AppRole.ROLE_APP_ADMIN);
        AppUser user5 = new AppUser("Sami", "1234",AppRole.ROLE_APP_ADMIN);
        AppUser user2 = new AppUser("Ahmad");
        AppUser user3 = new AppUser("Ahmad","123");
        System.out.println("User 1: "+user1);
        boolean equals = user1.equals(p1);
        System.out.println(equals);
        int hashCode = user1.hashCode();
        System.out.println(hashCode);


        user.setUsername("0");
        user.setRole(null);
    }

}


