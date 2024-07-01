package se.lexicon;

import java.time.LocalDate;

public class TodoItemTask {


    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public int getId() {
        return id;
    }
    //  public boolean isAssigned() {
//    return assigned;
//  }
//  public void setAssigned(boolean assigned) {
//    if (assignee == null) {
//      this.assigned = false;
//    } else {
//      this.assigned = true;
//    }
//  }
//  public boolean isAssigned() {
//    if (assignee == null) {
//      return false;
//    } else {
//      return true;
//    }
//  }
    public boolean isAssigned() {
        if (assignee == null) {
            assigned = false;
        } else {
            assigned = true;
        }
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) {
            throw new IllegalArgumentException("TodoItem should not be null");
        }
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public String getSummary() {
        return "{" +
                "id : "  + id +
                ", assigned : " + assigned +
                ", todoItem : " + todoItem +
                ", assignee : " + assignee.getSummary() +
                " }";
    }
}
