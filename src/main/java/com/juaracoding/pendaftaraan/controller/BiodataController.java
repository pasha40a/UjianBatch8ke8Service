package com.juaracoding.pendaftaraan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.pendaftaraan.entity.Biodata;
import com.juaracoding.pendaftaraan.repository.BiodataRepository;

@RestController
@RequestMapping("/biodata")
public class BiodataController {

	@Autowired
	BiodataRepository biodataRepo;
	@GetMapping("/")
	public List<Biodata> getAll() {
		return (List<Biodata>) biodataRepo.findAll();
	}
	
	@PostMapping("/addBiodata")
	public String addBiodata(@RequestBody Biodata biodata) {
		biodataRepo.save(biodata);
		return "Insert Berhasil";
	}
	
}
