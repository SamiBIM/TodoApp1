package org.example;


import java.time.LocalDate;

import org.junit.jupiter.api.*;

import se.lexicon.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class AppTest {






    @Test
    void test1() {
         //Given
        Person p1 = new Person();
        p1.setFirstName("Sami");
        p1.setLastName("Burhan");
        p1.setEmail("s.b@gmail");

        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("Cook");
        todoItem.setDeadLine(LocalDate.now().plusDays(1));
        todoItem.setCreator(p1);

        TodoItemTask todoItemTask = new TodoItemTask();
        todoItemTask.setAssigned(false);
        todoItemTask.setAssignee(p1);

        Assertions.assertTrue(todoItemTask.isAssigned());

    }

    @Test
    void test2(){

        Person p1 = new Person();
        p1.setFirstName("Sami");
        p1.setLastName("Burhan");
        p1.setEmail("s.b@gmail");

        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("Cook");
        todoItem.setDeadLine(LocalDate.now().plusDays(1));
        todoItem.setCreator(p1);

        TodoItemTask todoItemTask = new TodoItemTask();
        todoItemTask.setAssigned(false);
        todoItemTask.setAssignee(p1);

        Assertions.assertEquals("Cook", todoItem.getTitle());

    }

    @Test
    @DisplayName("Display name for the test")
    void test3(){
        //when

        //Give
        AppUser testUser = new AppUser();
        testUser.setUsername("username for test user");
        testUser.setPassword("password for test user");
        testUser.setRole(AppRole.ROLE_APP_USER);


        //verify
        Assertions.assertEquals("username for test user", testUser.getUsername());
        Assertions.assertEquals("password for test user", testUser.getPassword());
        Assertions.assertEquals(AppRole.ROLE_APP_USER, testUser.getRole());

        Assertions.assertNotEquals(AppRole.ROLE_APP_ADMIN, testUser.getRole());
    }

    @Test()
    void test4(){
        //when

        //Give
        AppUser testUser = new AppUser();


//        Exception ex =
//                assertThrows(IllegalArgumentException.class,
//                        () -> {
//                            testUser.setUsername(null);
//                        });

        //verify
//        Assertions.assertNull( testUser.getUsername());
//        Assertions.assertEquals("username not allowed to  be null", ex.getMessage());



    }
}
