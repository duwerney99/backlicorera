package com.proyecto.licoreraApp.rest;


import com.proyecto.licoreraApp.models.Productos;
import com.proyecto.licoreraApp.repository.IProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST})
public class RestDemoController {

    @Autowired
    private IProductosRepo repo;

    @GetMapping
    public List<Productos> listar(){
        return repo.findAll();
    }

    @PostMapping
    public void insertar(@RequestBody Productos pro){
        repo.save(pro);
    }

    @PutMapping
    public void modificar(@RequestBody Productos pro){
        repo.save(pro);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){ //se engloba el nombre a capturar con @PathVa...
        repo.deleteById(id);
    }
}
