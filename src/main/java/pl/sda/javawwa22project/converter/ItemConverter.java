package pl.sda.javawwa22project.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.sda.javawwa22project.dto.ItemDto;
import pl.sda.javawwa22project.entity.Item;

@Component
public class ItemConverter implements Converter<Item, ItemDto> {
    private CategoryConverter categoryConverter;

    @Autowired
    public void setCategoryConverter(CategoryConverter categoryConverter) {
        this.categoryConverter = categoryConverter;
    }

    @Override
    public ItemDto fromEntity(Item item) {
        return ItemDto.builder()
            .id(item.getId())
            .itemName(item.getItemName())
            .description(item.getDescription())
            .category(categoryConverter.fromEntity(item.getCategory()))
            .price(item.getPrice())
            .quantity(item.getQuantity())
            .picture(item.getPicture())
            .build();
    }

    @Override
    public Item fromDto(ItemDto itemDto) {
        return Item.builder()
            .id(itemDto.getId())
            .itemName(itemDto.getItemName())
            .description(itemDto.getDescription())
            .category(categoryConverter.fromDto(itemDto.getCategory()))
            .price(itemDto.getPrice())
            .quantity(itemDto.getQuantity())
            .picture(itemDto.getPicture())
            .build();
    }
}
