package com.myselectshop.entity;

import com.myselectshop.dto.RequestSaleItemDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue
    @Setter
    private Long id;

    private String username;
    private String title;
    private String content;
    private int price;

    public void updateItem(RequestSaleItemDto requestSaleItemDto) {
        this.username = requestSaleItemDto.getUsername();
        this.title = requestSaleItemDto.getTitle();
        this.content = requestSaleItemDto.getContent();
        this.price = requestSaleItemDto.getPrice();
    }
}
