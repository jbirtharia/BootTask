package com.phoenix.boottask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull(message = "Name is Required")
    @Max(value = 25,message = "Maximum Size is 25 Characters")
    private String name;

    @NotNull(message = "Owner Name is Required")
    @Max(value = 25,message = "Maximum Size is 25 Characters")
    private String owner;

    @Max(value = 50,message = "Maximum Size is 50 Characters")
    private String description;
}
