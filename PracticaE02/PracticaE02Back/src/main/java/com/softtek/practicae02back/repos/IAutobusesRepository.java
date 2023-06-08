package com.softtek.practicae02back.repos;


import com.softtek.practicae02back.modelo.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutobusesRepository extends JpaRepository<Autobus, String> {

}
