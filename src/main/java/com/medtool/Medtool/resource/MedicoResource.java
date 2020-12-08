package com.medtool.Medtool.resource;

import com.medtool.Medtool.model.Medico;
import com.medtool.Medtool.services.interfaces.MedicoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoResource {
    @Autowired(required=true)
    private MedicoServiceAPI service;

    @GetMapping("/{id}")
    @ResponseBody
    HttpEntity<Object> get(@PathVariable(name = "id") Long id) {

        Medico medico = service.get(id);
        return ResponseEntity.ok(medico);
    }


    @GetMapping
    @ResponseBody HttpEntity<Object> findAll() {

        List<Medico> Medico = service.findAll();

        if(Medico.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(Medico);
    }


    @PostMapping
    @ResponseBody HttpEntity<Object> create(@RequestBody Medico medico){

        medico = service.create(medico);
        return ResponseEntity.ok(medico);
    }


    @PutMapping("/{id}")
    @ResponseBody  HttpEntity<Object> update(@PathVariable(name = "id") Long id,
                                             @RequestBody Medico medico) {
        medico.setIdMedico(id);
        service.update(medico);

        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    @ResponseBody  HttpEntity<Object> remove(@PathVariable(name = "id") Long id) {

        service.remove(id);
        return ResponseEntity.noContent().build();
    }


}
