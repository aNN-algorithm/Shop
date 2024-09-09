package com.myselectshop.dto;

import com.myselectshop.entity.Item;
import lombok.Getter;

@Getter
public class RequestSaleItemDto {

    String username;
    String title;
    String content;
    int price;

    public static Item dtoToEntity(RequestSaleItemDto requestSaleItemDto) {

        return Item.builder()
                .username(requestSaleItemDto.username)
                .title(requestSaleItemDto.title)
                .content(requestSaleItemDto.content)
                .price(requestSaleItemDto.price)
                .build();
    }
}
