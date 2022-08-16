package com.econet.lms.repository;

import com.econet.lms.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AreaRepository extends JpaRepository<Area, Long> {
    public List<Area> findAll();
    public Optional<Area> findById(Long id);

}
