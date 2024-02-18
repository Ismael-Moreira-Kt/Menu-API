package com.example.menuapi.dto;

import com.example.menuapi.entity.MenuEntity;

public record MenuResponseDTO(Long id, String title, String image, Integer price) {
    public MenuResponseDTO(MenuEntity menuEntity) {
        this(menuEntity.getId(), menuEntity.getTitle(), menuEntity.getImage(), menuEntity.getPrice());
    }
}
