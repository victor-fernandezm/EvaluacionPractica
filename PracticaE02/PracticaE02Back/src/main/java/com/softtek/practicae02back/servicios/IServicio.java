package com.softtek.practicae02back.servicios;

import com.softtek.practicae02back.exceptions.AutobusNotFoundException;
import com.softtek.practicae02back.modelo.Autobus;
import com.softtek.practicae02back.modelo.Visita;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IServicio {
    Autobus getAutobus(String matricula);

    List<Visita> getVisitasByAutobus(String autobusMatricula);

    List<Autobus> getAutobuses();
}
