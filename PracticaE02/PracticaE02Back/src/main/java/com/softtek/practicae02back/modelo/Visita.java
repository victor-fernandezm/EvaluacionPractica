package com.softtek.practicae02back.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name = "Visitas")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date f_visita;

    @ManyToOne
    @JoinColumn(name = "matricula")
    private Autobus autobus;
    @ManyToOne
    @JoinColumn(name = "dni")
    private Conductor conductor;
    @ManyToOne
    @JoinColumn(name = "id_lugar")
    private Lugar lugar;
}
