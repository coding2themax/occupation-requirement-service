package com.coding2themax.career.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.lang.Nullable;

@Table(value = "occupation", schema = "career")
public class Occupation implements Persistable<Long> {
  @Id
  @Column(value = "id")
  private Long id;
  @Column(value = "name")
  private String name;
  @Column(value = "description")
  private String description;

  @Transient
  private boolean newOccupation;

  @Nullable
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

  @Override
  public boolean isNew() {
    return this.newOccupation || id == null;
  }

  public Occupation setAsNew() {
    this.newOccupation = true;
    return this;
  }

  public void setNewOccupation(boolean newOccupation) {
    this.newOccupation = newOccupation;
  }

}
