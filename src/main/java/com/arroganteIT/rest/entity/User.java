package com.arroganteIT.rest.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="firstname")
    private String name;

    @Column(name="lastname")
    private String lastname;

    @Column(name="age")
    private int age;

    @Column(name="mail")
    private String mail;
}
