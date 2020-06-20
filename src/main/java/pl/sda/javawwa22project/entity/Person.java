package pl.sda.javawwa22project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Person {

  @Id
  @GeneratedValue
  private Long id;
  private String name;

  @ManyToOne
  @JoinColumn(name = "my_house_id")
  private House house;
}
