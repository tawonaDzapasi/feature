package com.econet.lms.service.impl;

import com.econet.lms.repository.AreaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AreaServiceImplTest {

    @InjectMocks
    AreaServiceImpl areaService;

    @Mock
    AreaRepository areaRepository;

    @Test
    void getAll() {
    }

    @Test
    void getAreaById() {
    }

    @Test
    void save() {
    }
}