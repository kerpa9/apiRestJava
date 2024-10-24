package com.kevenreyes.apirest.apirest.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kevenreyes.apirest.apirest.Models.Carro;
import com.kevenreyes.apirest.apirest.Repositories.ICarroRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Carros")
public class CarroController {

    @Autowired
    private ICarroRepository carroRepository;

    // Get All

    @GetMapping
    public List<Carro> getAllCarros() {
        return carroRepository.findAll();
    }

    // Get one by id

    @GetMapping("/{id}")
    public Carro getOneCarros(@PathVariable Long id) {
        return carroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Don´t find id" + id));

    }

    @PostMapping
    public Carro createCarro(@RequestBody Carro carro) {
        return carroRepository.save(carro);
    }

    @PutMapping("/{id}")
    public Carro updateCarro(@PathVariable Long id, @RequestBody Carro detailsCar) {

        Carro carro = carroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Don't find id" + id));

                carro.setBrand(detailsCar.getBrand());
                carro.setModel(detailsCar.getModel());
                carro.setOrigin(detailsCar.getOrigin());

                return carroRepository.save(carro);

    }

    @DeleteMapping("/{id}")
    public Carro deleteCarro(@PathVariable Long id, @RequestBody Carro deleteCar){
        Carro carro=carroRepository.findById(id)
        .orElseThrow(()->new RuntimeException("Don't find id" + id));
        carroRepository.delete(carro);
        return carro;
    }

}
