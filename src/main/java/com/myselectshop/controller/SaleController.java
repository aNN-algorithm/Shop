package com.myselectshop.controller;

import com.myselectshop.dto.RequestSaleItemDto;
import com.myselectshop.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;

    @PostMapping("/post")
    public ResponseEntity<?> registerSaleItem(@RequestBody RequestSaleItemDto requestSaleItemDto) {

        var result = saleService.registerSaleItem(requestSaleItemDto);

        return ResponseEntity.ok(result);
    }

    @GetMapping("/post")
    public ResponseEntity<?> readSaleItem() {

        var result = saleService.readSaleItem();

        return ResponseEntity.ok(result);
    }

    @PutMapping("/post/{id}")
    public ResponseEntity<?> updateSaleItem(@PathVariable Long id, @RequestBody RequestSaleItemDto requestSaleItemDto) {

        var result = saleService.updateSaleItem(id, requestSaleItemDto);

        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/post/{id}")
    public ResponseEntity<?> deleteSaleItem(@PathVariable Long id) {

        var result = saleService.deleteSaleItem(id);

        return ResponseEntity.ok(result);
    }
}
