package com.company.example;

@io.swagger.v3.oas.annotations.media.Schema(name="parameterQueryServiceEntityResult", description="")
public class EntityResult
{
  @javax.validation.Valid
  @io.swagger.v3.oas.annotations.media.Schema(name = "relations")
  @javax.xml.bind.annotation.XmlElement(name = "relations", type=RelationResult.class)
  private java.util.List<RelationResult> relations;

  public java.util.List<RelationResult> getRelations()
  {
    return relations;
  }

  public void setRelations(java.util.List<RelationResult> relations)
  {
    this.relations = relations;
  }
  
  
}


