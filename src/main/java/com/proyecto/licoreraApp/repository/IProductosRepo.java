package com.proyecto.licoreraApp.repository;

import com.proyecto.licoreraApp.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductosRepo extends JpaRepository<Productos, Integer> {
}
