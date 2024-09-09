package com.myselectshop.dto;

import com.myselectshop.entity.Item;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ResponseSaleItemDto {

    Long id;
    String username;
    String title;
    String content;
    int price;

    public static ResponseSaleItemDto entityToDto(Item item) {
        return ResponseSaleItemDto.builder()
                .id(item.getId())
                .username(item.getUsername())
                .title(item.getTitle())
                .content(item.getTitle())
                .price(item.getPrice())
                .build();
    }
}
