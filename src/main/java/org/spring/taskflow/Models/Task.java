package org.spring.taskflow.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    private int id;
    private String title;
    private String description;
    private Status status;
    private Priority priority;
    private String dueDate;
    private int user;
}
