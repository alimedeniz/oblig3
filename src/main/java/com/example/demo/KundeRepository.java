package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KundeRepository {
    @Autowired
    private JdbcTemplate db;
    public void Lagrekunde(Billett innBillett){
        String sql= "INSERT INTO Billett (film, antall, fornavn, etternavn, tlf, epost) VALUES(?,?,?,?,?,?)";
         try {
             db.update(sql,innBillett.getFilm(),innBillett.getAntall(), innBillett.getFornavn(), innBillett.getEtternavn(), innBillett.getTlf(), innBillett.getEpost());
         }   catch (Exception e) {
             System.out.println(e);
         }
         
    }
public List<Billett> hentalleBilletter (){
        String sql= "SELECT * FROM Billett order by etternavn";
        List<Billett> alleBilletter = db.query(sql, new BeanPropertyRowMapper(Billett.class));
        return alleBilletter;
        
}
public void slettAllebilletter(){
String sql= "DELETE FROM Billett";
db.update(sql);
}
}

