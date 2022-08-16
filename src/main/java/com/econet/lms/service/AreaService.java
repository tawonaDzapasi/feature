package com.econet.lms.service;

import com.econet.lms.entity.Area;

import java.util.List;

public interface AreaService {
    public List<Area> getAll();
    public Area getAreaById(Long id);
    public Area save(Area area);
}
