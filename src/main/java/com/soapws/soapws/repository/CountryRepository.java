package com.soapws.soapws.repository;

import com.soapws.soapws.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, String> {

    @Query(value = "SELECT c FROM CountryEntity c WHERE name = :name", nativeQuery = false)
    CountryEntity findCountryByName(String name);
}
