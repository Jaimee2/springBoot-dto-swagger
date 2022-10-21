package com.example.springboottutorialdto.repository;

import com.example.springboottutorialdto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
