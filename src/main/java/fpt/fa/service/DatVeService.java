package fpt.fa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fpt.fa.DTO.DatVeDTO;
import fpt.fa.entity.DatVe;

public interface DatVeService {
	void create(DatVeDTO dvDTO);
	void update(DatVe dv);
	DatVe findById(String id);
	List<DatVe> findAll();
	void delete(String id);
//	Page<DatVe> findAll(String search, Pageable pageable);
}
