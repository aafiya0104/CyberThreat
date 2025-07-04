package com.cyberthreat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role")
    private String role;
public Role(String role) {
    this.role = role;
}
    // Default constructor
    public Role() {
        // No-arg constructor for JPA
    }

    // Copy constructor
    public Role(Role role) {
        this.roleId = role.getRoleId();
        this.role = role.getRole();
}


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
