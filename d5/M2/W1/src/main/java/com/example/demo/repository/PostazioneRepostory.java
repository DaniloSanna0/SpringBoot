package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Postazione;
@Repository
public interface PostazioneRepostory extends PagingAndSortingRepository<Postazione,Integer> {

	@Override
	default Iterable<Postazione> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
