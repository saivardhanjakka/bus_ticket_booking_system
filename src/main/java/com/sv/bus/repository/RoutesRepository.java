package com.sv.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sv.bus.entity.Routes;

@Repository
public interface RoutesRepository extends JpaRepository<Routes,Long>{

}
