package com.kevenreyes.apirest.apirest.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kevenreyes.apirest.apirest.Models.Carro;



public interface ICarroRepository extends JpaRepository <Carro, Long> {    
}