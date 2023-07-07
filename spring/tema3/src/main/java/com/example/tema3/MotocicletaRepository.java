package com.example.tema3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotocicletaRepository extends JpaRepository<Motocicleta, Long> {
}
