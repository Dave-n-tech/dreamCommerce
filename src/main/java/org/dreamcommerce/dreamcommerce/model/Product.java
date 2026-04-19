package org.dreamcommerce.dreamcommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.UUID;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = UUID)
    private String id;
}
