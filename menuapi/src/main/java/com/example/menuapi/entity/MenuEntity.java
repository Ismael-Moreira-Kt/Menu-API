package com.example.menuapi.entity;

import com.example.menuapi.dto.MenuRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="foods")
@Entity(name="foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class MenuEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String image;
    private Integer price;

    public MenuEntity(MenuRequestDTO data) {
        this.image = data.image();
        this.title = data.title();
        this.price = data.price();
    }
}