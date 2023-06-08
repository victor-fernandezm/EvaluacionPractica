package com.softtek.practicae02back.repos;


import com.softtek.practicae02back.modelo.Autobus;
import com.softtek.practicae02back.modelo.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConductoresRepository extends JpaRepository<Conductor, String> {

}
