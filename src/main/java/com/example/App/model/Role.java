package com.example.App.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    private long id;
    private ERole name;

}
