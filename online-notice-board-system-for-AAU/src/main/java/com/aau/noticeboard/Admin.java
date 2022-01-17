package com.aau.noticeboard;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String Name;

    @NotNull
    private String username;

    @NotNull
    private String password;

    



}
