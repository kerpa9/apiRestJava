package com.kevenreyes.apirest.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevenreyes.apirest.apirest.Models.Carro;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/Carros")
public class CarroController {

    @Autowired
    private CrudRepository carroRespository;

    @GetMapping
    public List<Carro> getAllCarros() {
        return (List<Carro>) carroRespository.findAll();
    }
    // @GetMapping ("/{id}")
    // public List<Carro> getOneCarros(@PathVariable Long id) {
    //     return (List<Carro>) carroRespository.findAllById(id);
    //     // .orElseTr
    // }

    @PostMapping
    public Carro createCarro(@RequestBody Carro carro){
        return (Carro) carroRespository.save(carro);
    }

    // @PutMapping
    // public Carro updateCarro(@PathVariable Long id, @RequestBody Carro detailCar){

    // }

}
