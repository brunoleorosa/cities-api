package com.github.brunoleorosa.citiesapi.states.repositories;

import com.github.brunoleorosa.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
