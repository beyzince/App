package com.example.App.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id
    private long id;
    private String name;
    private String surname;
    @NotBlank
    @Size(max=20)
    private String username;
    @NotBlank
    @Size(max = 120)
    private String password;
    private String phoneNumber;
    private String address;
    private String gender;
    private String profileTitle;
    @NotBlank
    @Size(max=50)
    private String email;

}
