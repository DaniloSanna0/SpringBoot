package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Edificio;
@Repository
public interface EdificioRepository extends PagingAndSortingRepository<Edificio,Integer>{
@Override
default Iterable<Edificio> findAll() {
	// TODO Auto-generated method stub
	return null;
}
}
