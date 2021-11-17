package com.ivoronline.springboot_deserialize_xml_annotations_setters.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "person")
public class PersonDTO {

  //PROPERTIES
  private Integer id;
  private String  name;
  private Integer age;

  //SETTERS (Used by JAXB for Unmarshaling)
  @XmlAttribute(name = "personid"  ) public void setId  (Integer id  ) { this.id   = id;              }
  @XmlElement  (name = "personname") public void setName(String  name) { this.name = "Setter" + name; }
  @XmlTransient                      public void setAge (Integer age ) { this.age  = age;             }

  //GETTERS (Used by us to read Properties)
  public Integer getId  () { return id;   }
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

}
