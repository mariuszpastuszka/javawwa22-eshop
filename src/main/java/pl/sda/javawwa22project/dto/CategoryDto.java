package pl.sda.javawwa22project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class CategoryDto {
    private Long id;
    private String name;
    private List<ItemDto> items;
}
