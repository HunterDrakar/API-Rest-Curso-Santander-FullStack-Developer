package com.digitalinnovationone.ProjetoDio.service;

import com.digitalinnovationone.ProjetoDio.model.JornadaTrabalho;
import com.digitalinnovationone.ProjetoDio.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        jornadaRepository.save(jornadaTrabalho);
        return jornadaTrabalho;
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
