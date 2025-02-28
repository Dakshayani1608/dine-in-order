package com.example.dio.model;

import com.example.dio.enums.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="User")
@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="user_id")
    private  long userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="phone_no")
    private  long phoneNo;

    @Column(name="user_role")
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="last_modified_at")
    private LocalDateTime lastModifiedAt;



}
