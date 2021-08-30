package com.joyonta.springjpamanytoonebidirectionalrelationshipmapping.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "course")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "instructor")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "instructorId"
    )
    private Instructor instructor;

   }