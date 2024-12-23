package com.example.SpringBootCRUD.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity(name = "Customer")
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "First Name is required")
    @Size(min = 5, message = "First Name should be at least 5 characters")
  @Column(name = "first_Name")
    private String firstName;

    @NotEmpty(message = "Last Name is required")
    @Size(min = 5, message = "Last Name should be at least 5 characters")
    @Column(name = "last_Name")
    private String lastName;

    @NotEmpty(message = "Email is required")
    @Email(message = "Pleacxe enter a valid email address")
    @Column(name = "email")
    private String email;


    @Column(name = "phone")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
