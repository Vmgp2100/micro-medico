package com.mx.Medicos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Medicos.entidad.Medico;

public interface MedicoDao extends JpaRepository<Medico,Long>{
	List<Medico> findByNumeroClinica(int numeroClinica);

}
