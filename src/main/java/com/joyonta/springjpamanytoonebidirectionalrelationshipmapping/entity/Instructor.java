package com.joyonta.springjpamanytoonebidirectionalrelationshipmapping.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Instructor {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long instructorId;

    private String firstName;

    private String lastName;

    private String email;

    @OneToMany(
            mappedBy = "instructor",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    private List<Course> courses;

}