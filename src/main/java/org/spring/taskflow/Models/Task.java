package org.spring.taskflow.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "task")
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    private String description;
    private Enum status;
    private Enum priority;
    private String dueDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
