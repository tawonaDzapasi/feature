package com.econet.lms.controller;

import com.econet.lms.entity.Area;
import com.econet.lms.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AreaController {

    @Autowired
    AreaService areaService;

    @PostMapping("/area")
    public ResponseEntity<Area> saveArea(@RequestBody Area area){
        return new ResponseEntity<Area>(areaService.save(area),HttpStatus.CREATED);
    }
    @GetMapping("/area")
    public List<Area> getAll(){
        return areaService.getAll();
    }
    @GetMapping("/area/{id}")
    public ResponseEntity<Area> getAreaById(@PathVariable("id") Long areaId){
        return new ResponseEntity<>(areaService.getAreaById(areaId), HttpStatus.OK);
    }

}
