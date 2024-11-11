package com.coding2themax.persistance.occupation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "occupation", schema = "career")
public class Occupation {

  @Id
  @Column("id")
  private Long id;
  @Column("name")
  private String name;
  @Column("description")
  private String description;

  // Default constructor
  public Occupation() {
  }

  // Parameterized constructor
  public Occupation(String name, String description) {
    this.name = name;
    this.description = description;
  }

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  // toString method
  @Override
  public String toString() {
    return "Occupation{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}