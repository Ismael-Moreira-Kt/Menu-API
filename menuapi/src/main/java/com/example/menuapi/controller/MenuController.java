package com.example.menuapi.controller;

import com.example.menuapi.dto.MenuRequestDTO;
import com.example.menuapi.dto.MenuResponseDTO;
import com.example.menuapi.entity.MenuEntity;
import com.example.menuapi.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("food")
public class MenuController {
    @Autowired
    private MenuRepository repository;

    @GetMapping
    public List<MenuResponseDTO> getAll() {
        List<MenuResponseDTO> foodList = repository.findAll().stream().map(MenuResponseDTO::new).collect(Collectors.toList());
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody MenuRequestDTO data) {
        MenuEntity food = new MenuEntity(data);
        repository.save(food);
    }
}