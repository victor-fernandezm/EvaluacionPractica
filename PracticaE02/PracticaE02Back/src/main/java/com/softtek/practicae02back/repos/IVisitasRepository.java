package com.softtek.practicae02back.repos;


import com.softtek.practicae02back.modelo.Lugar;
import com.softtek.practicae02back.modelo.Visita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVisitasRepository extends JpaRepository<Visita, String> {

}
