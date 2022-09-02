package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Utente;
@Repository
public interface UtenteRepository extends PagingAndSortingRepository<Utente,Integer>{
@Override
default Iterable<Utente> findAll() {
	// TODO Auto-generated method stub
	return null;
}
}
