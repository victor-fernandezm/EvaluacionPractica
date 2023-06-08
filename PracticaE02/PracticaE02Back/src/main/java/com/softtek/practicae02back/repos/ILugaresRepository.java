package com.softtek.practicae02back.repos;


import com.softtek.practicae02back.modelo.Conductor;
import com.softtek.practicae02back.modelo.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILugaresRepository extends JpaRepository<Lugar, String> {

}
