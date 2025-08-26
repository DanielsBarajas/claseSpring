package com.jdc.web.Service;

import com.jdc.web.entities.ColegioEntity;

import java.util.List;

public interface ColegioService {
    public List<ColegioEntity> findAll();

    public ColegioEntity findById(Long id);

    public void save(ColegioEntity colegio);

    public void deleteById(Long id);

}
