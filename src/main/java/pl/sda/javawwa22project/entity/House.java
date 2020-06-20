package pl.sda.javawwa22project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Builder
@Data
public class House {

  @Id
  @GeneratedValue
  private Long id;

  @OneToMany(mappedBy = "house")
  private List<Person> persons;
}
