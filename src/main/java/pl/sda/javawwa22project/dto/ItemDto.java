package pl.sda.javawwa22project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class ItemDto {
  private Long id;
  @NotNull
  @Size(min = 2, max = 150, message = "Nazwa musi mieć przynajmniej 2 znaki, maksymalnie 150")
  // TODO: dla Daniela dwie wiadomości
  private String itemName;
  @NotNull
  private String description;
  @NotNull
  @Size(min = 2)
  private String category;
  @Min(1)
  private BigDecimal price;
  @Min(1)
  @Max(100_000)
  private int quantity;
  private String picture;
}
