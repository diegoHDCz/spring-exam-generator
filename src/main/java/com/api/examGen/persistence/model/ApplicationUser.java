package com.api.examGen.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class ApplicationUser extends AbastractEntity {
    @NotEmpty(message = "Required Field")
    @Column(unique = true)
    private String username;
    @NotEmpty(message = "Required Field")
    private String password;
    @OneToOne
    private Professor professor;

    public ApplicationUser() {}
    public ApplicationUser(ApplicationUser applicationUser) {
        this.username = applicationUser.username;
        this.password = applicationUser.password;
        this.professor = applicationUser.professor;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
