package com.example.menuapi.repository;

import com.example.menuapi.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {}