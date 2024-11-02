package com.coding2themax.career.model;

public class Occupation {

  private Long id;
  private String name;
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