package com.jdc.web.Service;

import com.jdc.web.entities.ColegioEntity;
import com.jdc.web.repository.ColegioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ColegioServicelmpl implements ColegioService{

    @Autowired
    private ColegioRepository colegioRepository;

    @Autowired
    private ColegioServicelmpl service2;

    @Override
    @Transactional(readOnly = true)
    public List<ColegioEntity> findAll(){
        return (List<ColegioEntity>) colegioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ColegioEntity findById(Long id) {
        return colegioRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(ColegioEntity colegio) {
        colegioRepository.save(colegio);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        colegioRepository.deleteById(id);
    }
}
