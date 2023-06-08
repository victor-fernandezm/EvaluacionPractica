package com.softtek.practicae02back.controller;

import com.softtek.practicae02back.modelo.Autobus;
import com.softtek.practicae02back.modelo.Visita;
import com.softtek.practicae02back.servicios.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/")
public class RESTController {
    @Autowired
    private IServicio servicio;

    @GetMapping("/autobuses/list")
    public List<EntityModel> getAutobuses() {
        List<Autobus> autobuses = servicio.getAutobuses();

        ArrayList<EntityModel> autobusesModel = new ArrayList<>();

        WebMvcLinkBuilder autobusLink;
        WebMvcLinkBuilder visitasLink;
        for (Autobus bus : autobuses) {
            autobusLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAutobus(bus.getMatricula()));
            visitasLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getVisitasByAutobus(bus.getMatricula()));
            autobusesModel.add(EntityModel.of(bus).add(autobusLink.withRel("autobus-link"), visitasLink.withRel("visitas-link")));
        }
        return autobusesModel;
    }

    @GetMapping("/autobuses/get/{matricula}")
    public EntityModel<Autobus> getAutobus(@PathVariable("matricula") String matricula) {
        Autobus bus = servicio.getAutobus(matricula);
        WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAutobus(matricula));
        WebMvcLinkBuilder visitasLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getVisitasByAutobus(matricula));
        return EntityModel.of(bus).add(link.withRel("autobus-link"), visitasLink.withRel("visitas-link"));
    }

    @GetMapping("/autobuses/get/{matricula}/visitas")
    public List<EntityModel> getVisitasByAutobus(@PathVariable("matricula") String matricula) {
        List<Visita> visitas = servicio.getVisitasByAutobus(matricula);

        ArrayList<EntityModel> visitasModel = new ArrayList<>();
        for (Visita v : visitas) {
            visitasModel.add(EntityModel.of(v));
//            .add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAutobus(matricula)).withRel("visita-link")))
        }
        return visitasModel;
    }

}
