package com.econet.lms.repository;

import com.econet.lms.entity.Area;
import com.econet.lms.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShopRepository extends JpaRepository<Shop, Long> {
    public List<Shop> findAll();
    public Optional<Shop> findById(Long id);
    public List<Shop> findByAreaName(String areaName);

}
