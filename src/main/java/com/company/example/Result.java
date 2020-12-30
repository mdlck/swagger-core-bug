package com.company.example;

@io.swagger.v3.oas.annotations.media.Schema(name="parameterQueryServiceResult")
public class Result
{

  @javax.validation.Valid
  @io.swagger.v3.oas.annotations.media.Schema(name = "entities")
  @javax.xml.bind.annotation.XmlElement(name = "entities", type=EntityResult.class)
  private java.util.List<EntityResult> entities;

  public java.util.List<EntityResult> getEntities()
  {
    return entities;
  }

  public void setEntities(java.util.List<EntityResult> entities)
  {
    this.entities = entities;
  }
  
  
}
