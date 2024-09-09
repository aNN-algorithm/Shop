package com.myselectshop.service;

import com.myselectshop.dto.ItemDto;
import com.myselectshop.dto.RequestSaleItemDto;
import com.myselectshop.dto.ResponseMsg;
import com.myselectshop.dto.ResponseSaleItemDto;
import com.myselectshop.entity.Item;
import com.myselectshop.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class SaleService {

    private final SaleRepository saleRepository;

    public ResponseSaleItemDto registerSaleItem(RequestSaleItemDto requestSaleItemDto) {
        Item registeredItem = saleRepository.save(RequestSaleItemDto.dtoToEntity(requestSaleItemDto));

        return ResponseSaleItemDto.entityToDto(registeredItem);
    }

    public List<ItemDto> readSaleItem() {

        List<ItemDto> itemDtos = new ArrayList<>();
        List<Item> items = saleRepository.findAll();
        for (Item item : items) {
            itemDtos.add(ItemDto.entityToDto(item));
        }

        return itemDtos;
    }

    public ResponseSaleItemDto updateSaleItem(Long id, RequestSaleItemDto requestSaleItemDto) {

        Item updatedItem = saleRepository.findById(id).orElseThrow(() -> new NoSuchElementException("해당 ID를 찾을 수 없습니다. : " + id));
        updatedItem.updateItem(requestSaleItemDto);
        
        return ResponseSaleItemDto.entityToDto(saleRepository.save(updatedItem));
    }


    public ResponseMsg deleteSaleItem(Long id) {

        if (!saleRepository.existsById(id)) {
            throw new NoSuchElementException("해당 ID를 찾을 수 없습니다. : " + id);
        }

        saleRepository.deleteById(id);
        return new ResponseMsg("삭제완료");
    }
}
