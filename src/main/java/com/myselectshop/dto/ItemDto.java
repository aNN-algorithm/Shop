package com.myselectshop.dto;

import com.myselectshop.entity.Item;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ItemDto {

    private Long id;
    private String username;
    private String title;
    private int price;

    public static ItemDto entityToDto(Item item) {
        return ItemDto.builder()
                .id(item.getId())
                .username(item.getUsername())
                .title(item.getTitle())
                .price(item.getPrice())
                .build();
    }
}
