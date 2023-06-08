package com.softtek.practicae02back.servicios;

import com.softtek.practicae02back.exceptions.AutobusNotFoundException;
import com.softtek.practicae02back.modelo.Autobus;
import com.softtek.practicae02back.modelo.Visita;
import com.softtek.practicae02back.repos.IAutobusesRepository;
import com.softtek.practicae02back.repos.IConductoresRepository;
import com.softtek.practicae02back.repos.ILugaresRepository;
import com.softtek.practicae02back.repos.IVisitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioImpl implements IServicio {
    @Autowired
    IAutobusesRepository autobusesRepository;

    @Autowired
    IConductoresRepository conductoresRepository;

    @Autowired
    ILugaresRepository lugaresRepository;

    @Autowired
    IVisitasRepository visitasRepository;


    @Override
    public Autobus getAutobus(String matricula)  {
        return autobusesRepository.findById(matricula).orElseThrow(() -> new AutobusNotFoundException("EL autobus no ha sido encontrado", matricula));
    }

    @Override
    public List<Visita> getVisitasByAutobus(String autobusMatricula) {
        return visitasRepository.findAll().stream().filter(v -> v.getAutobus().getMatricula().equals(autobusMatricula)).toList();
    }

    @Override
    public List<Autobus> getAutobuses() {
        return autobusesRepository.findAll();
    }
}
