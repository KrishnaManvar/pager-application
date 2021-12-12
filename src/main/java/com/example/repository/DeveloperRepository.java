package com.example.repository;

import com.example.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeveloperRepository extends JpaRepository<Developer, String> {

    List<Developer> findByTeamId(String teamId);
}
