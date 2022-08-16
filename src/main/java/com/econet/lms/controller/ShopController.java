package com.econet.lms.controller;
import com.econet.lms.entity.Shop;
import com.econet.lms.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShopController {
    @Autowired
    ShopService shopService;

    @PostMapping("/shop")
    public ResponseEntity<Shop> saveShop(@RequestBody Shop shop){
        return new ResponseEntity<Shop>(shopService.save(shop),HttpStatus.CREATED);
    }

}
