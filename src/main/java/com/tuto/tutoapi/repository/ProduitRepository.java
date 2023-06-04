package com.tuto.tutoapi.repository;

import com.tuto.tutoapi.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
