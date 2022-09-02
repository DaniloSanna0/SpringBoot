package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Prenotazione;
import com.example.demo.models.Tipo;
@Repository
public interface PrenotazioneRepository extends PagingAndSortingRepository<Prenotazione,Integer>{

	public List<Prenotazione>findByPostazioneAndCittà(Tipo tipo,String città);
}
