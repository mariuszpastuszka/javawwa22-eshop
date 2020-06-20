package pl.sda.javawwa22project.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.sda.javawwa22project.dto.CategoryDto;
import pl.sda.javawwa22project.dto.ItemDto;
import pl.sda.javawwa22project.entity.Category;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryConverter implements Converter<Category, CategoryDto> {
  private ItemConverter itemConverter;

  @Autowired
  public void setItemConverter(ItemConverter itemConverter) {
    this.itemConverter = itemConverter;
  }

  @Override
  public CategoryDto fromEntity(Category entity) {
    return CategoryDto.builder()
        .id(entity.getId())
        .name(entity.getName())
        .items(getAllItemsConverted(entity))
        .build();
  }

  @Override
  public Category fromDto(CategoryDto dto) {
    return null;
  }

  private List<ItemDto> getAllItemsConverted(Category entity) {
    return entity
        .getItems()
        .stream()
        .map(itemConverter::fromEntity)
        .collect(Collectors.toList());
  }
}
