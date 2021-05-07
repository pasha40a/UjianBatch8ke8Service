package com.juaracoding.pendaftaraan.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.juaracoding.pendaftaraan.entity.Biodata;

public interface BiodataRepository extends CrudRepository<Biodata, Long> {
	
}
