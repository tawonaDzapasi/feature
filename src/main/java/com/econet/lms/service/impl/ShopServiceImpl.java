package com.econet.lms.service.impl;
import com.econet.lms.entity.Shop;
import com.econet.lms.repository.ShopRepository;
import com.econet.lms.service.ShopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopRepository shopRepository;

    @Override
    public List<Shop> getAll() {
        return shopRepository.findAll();
    }
    @Override
    public Shop getShopById(Long id) {
        Optional<Shop> optionalShop=shopRepository.findById(id);
        if(optionalShop.isPresent()){
            return optionalShop.get();
        }
        return null;
    }
    @Override
    public Shop save(Shop shop) {
        return shopRepository.save(shop);

    }
    @Override
    public List<Shop> getShopByAreaName(String areaName) {
        return shopRepository.findByAreaName(areaName);
    }
}
