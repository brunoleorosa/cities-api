package com.github.brunoleorosa.citiesapi.countries.repositories;

import com.github.brunoleorosa.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
