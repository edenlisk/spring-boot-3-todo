package com.edenlisk.springboottodo.todo;

import java.time.LocalDate;
import java.util.Date;

public class Todo {
    private long id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean completed;

    public Todo(long id, String username, String description, LocalDate targetDate, boolean completed) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", completed=" + completed +
                '}';
    }
}
