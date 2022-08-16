package com.econet.lms.service.impl;
import com.econet.lms.entity.Area;
import com.econet.lms.repository.AreaRepository;
import com.econet.lms.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    AreaRepository areaRepository;

    @Override
    public List<Area> getAll() {
        return areaRepository.findAll();
    }
    @Override
    public Area getAreaById(Long id) {
        Optional<Area> optionalArea=areaRepository.findById(id);
        if(optionalArea.isPresent()){
            return optionalArea.get();
        }
        return null;
    }
    @Override
    public Area save(Area area) {
        return areaRepository.save(area);

    }
}
