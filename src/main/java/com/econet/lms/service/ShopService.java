package com.econet.lms.service;

import com.econet.lms.entity.Area;
import com.econet.lms.entity.Shop;

import java.util.List;

public interface ShopService {
    public List<Shop> getAll();
    public Shop getShopById(Long id);
    public Shop save(Shop shop);
    public List<Shop> getShopByAreaName(String areaName);
}
