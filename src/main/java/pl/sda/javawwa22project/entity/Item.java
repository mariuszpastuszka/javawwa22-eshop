package pl.sda.javawwa22project.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Builder
@Entity
@Table(name = "SHOP_ITEMS")
// 1). define entity
//  - id
// - no args constructor
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String itemName;
    private String description;
    @ManyToOne
    private Category category;
    private BigDecimal price;
    private int quantity;
    private String picture;
//    private int any; // have fun:) look out!!!
}
