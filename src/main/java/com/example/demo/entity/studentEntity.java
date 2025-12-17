package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
public class studentEntity{
@Id
@GeneratedValue(startegy=GenerationType.IDENTITY)
private Long id;
@NotBlank(message="Name is not Valid");
private String name;
@Email(message="Email format is not Valid")
private String email;

}