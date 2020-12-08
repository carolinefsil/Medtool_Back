package com.medtool.Medtool.resource;

import com.medtool.Medtool.model.Prescricao;
import com.medtool.Medtool.services.interfaces.PrecricaoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/prescricao")
public class PrescricaoResource {


    @Autowired(required=true)
    private PrecricaoServiceAPI service;

    @GetMapping("/{id}")
    @ResponseBody
    HttpEntity<Object> get(@PathVariable(name = "id") Long id) {

        Prescricao prescricao = service.get(id);
        return ResponseEntity.ok(prescricao);
    }


    @GetMapping
    @ResponseBody HttpEntity<Object> findAll() {

        List<Prescricao> Prescricao = service.findAll();

        if(Prescricao.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(Prescricao);
    }


    @PostMapping
    @ResponseBody HttpEntity<Object> create(@RequestBody Prescricao prescricao){

        prescricao = service.create(prescricao);
        return ResponseEntity.ok(prescricao);
    }


    @PutMapping("/{id}")
    @ResponseBody  HttpEntity<Object> update(@PathVariable(name = "id") Long id,
                                             @RequestBody Prescricao prescricao) {
        prescricao.setIdPrecicao(id);
        service.update(prescricao);

        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    @ResponseBody  HttpEntity<Object> remove(@PathVariable(name = "id") Long id) {

        service.remove(id);
        return ResponseEntity.noContent().build();
    }
}
