package com.econet.lms.service.impl;

import com.econet.lms.entity.Area;
import com.econet.lms.entity.Shop;
import com.econet.lms.repository.ShopRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class ShopServiceImplTest {
    @InjectMocks
    ShopServiceImpl service;

    @Mock
    ShopRepository shopRepository;


    @Test
    void getAll() {
    }

    @Test
    void getShopById() {
    }

    @Test
    void save() {
        Shop shop = new Shop();
        Area area=new Area();
        shop.setName("Econet First Street");
        shop.setArea(area);
        service.save(shop);
        Mockito.verify(shopRepository,times(1)).save(shop);
    }

    @Test
    void getShopByAreaName() {
        List<Shop> list = new ArrayList<Shop>();
        Shop shop1 = new Shop();
        Area area1=new Area();
        area1.setName("HARARE CBD");
        shop1.setName("Econet First Street");
        shop1.setArea(area1);

        Shop shop2 = new Shop();
        Area area2=new Area();
        area1.setName("HARARE CBD");
        shop2.setName("Econet Second Street");
        shop2.setArea(area2);
        list.add(shop1);
        list.add(shop2);
        Mockito.when(shopRepository.findByAreaName("HARARE CBD")).thenReturn(list);
        List<Shop> empList = service.shopRepository.findByAreaName("HARARE CBD");
        assertEquals(2, empList.size());
        Mockito.verify(shopRepository, times(1)).findByAreaName("HARARE CBD");
    }
}