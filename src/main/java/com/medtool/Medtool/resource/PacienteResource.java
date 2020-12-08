package com.medtool.Medtool.resource;


import com.medtool.Medtool.model.Paciente;
import com.medtool.Medtool.services.interfaces.PacienteServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteResource {

    @Autowired(required=true)
    private PacienteServiceAPI service;

    @GetMapping("/{id}")
    @ResponseBody
    HttpEntity<Object> get(@PathVariable(name = "id") Long id) {

        Paciente paciente = service.get(id);
        return ResponseEntity.ok(paciente);
    }


    @GetMapping
    @ResponseBody HttpEntity<Object> findAll() {

        List<Paciente> Paciente = service.findAll();

        if(Paciente.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(Paciente);
    }


    @PostMapping
    @ResponseBody HttpEntity<Object> create(@RequestBody Paciente paciente){

        paciente = service.create(paciente);
        return ResponseEntity.ok(paciente);
    }


    @PutMapping("/{id}")
    @ResponseBody  HttpEntity<Object> update(@PathVariable(name = "id") Long id,
                                             @RequestBody Paciente paciente) {
        paciente.setIdPaciente(id);
        service.update(paciente);

        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    @ResponseBody  HttpEntity<Object> remove(@PathVariable(name = "id") Long id) {

        service.remove(id);
        return ResponseEntity.noContent().build();
    }
}
