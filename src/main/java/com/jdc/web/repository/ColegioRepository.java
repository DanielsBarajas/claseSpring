package com.jdc.web.repository;


import com.jdc.web.entities.ColegioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColegioRepository extends CrudRepository<ColegioEntity,Long> {

}
