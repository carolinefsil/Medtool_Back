package com.medtool.Medtool.resource;


import com.medtool.Medtool.model.Consulta;
import com.medtool.Medtool.services.interfaces.ConsultaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaResource {

    @Autowired(required=true)
    private ConsultaServiceAPI service;

    @GetMapping("/{id}")
    @ResponseBody
    HttpEntity<Object> get(@PathVariable(name = "id") Long id) {

        Consulta consulta = service.get(id);
        return ResponseEntity.ok(consulta);
    }


    @GetMapping
    @ResponseBody HttpEntity<Object> findAll() {

        List<Consulta> Consulta = service.findAll();

        if(Consulta.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(Consulta);
    }


    @PostMapping
    @ResponseBody HttpEntity<Object> create(@RequestBody Consulta consulta){

        consulta = service.create(consulta);
        return ResponseEntity.ok(consulta);
    }


    @PutMapping("/{id}")
    @ResponseBody  HttpEntity<Object> update(@PathVariable(name = "id") Long id,
                                             @RequestBody Consulta consulta) {
        consulta.setIdConsuta(id);
        service.update(consulta);

        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    @ResponseBody  HttpEntity<Object> remove(@PathVariable(name = "id") Long id) {

        service.remove(id);
        return ResponseEntity.noContent().build();
    }
}
