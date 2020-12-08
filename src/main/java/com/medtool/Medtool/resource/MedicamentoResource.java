package com.medtool.Medtool.resource;



import com.medtool.Medtool.model.Medicamento;
import com.medtool.Medtool.services.interfaces.MedicamentoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoResource {

    @Autowired(required=true)
    private MedicamentoServiceAPI service;

    @GetMapping("/{id}")
    @ResponseBody
    HttpEntity<Object> get(@PathVariable(name = "id") Long id) {

        Medicamento medicamento = service.get(id);
        return ResponseEntity.ok(medicamento);
    }


    @GetMapping
    @ResponseBody HttpEntity<Object> findAll() {

        List<Medicamento> Medicamento = service.findAll();

        if(Medicamento.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(Medicamento);
    }


    @PostMapping
    @ResponseBody HttpEntity<Object> create(@RequestBody Medicamento medicamento){

        medicamento = service.create(medicamento);
        return ResponseEntity.ok(medicamento);
    }


    @PutMapping("/{id}")
    @ResponseBody  HttpEntity<Object> update(@PathVariable(name = "id") Long id,
                                             @RequestBody Medicamento medicamento) {
        medicamento.setIdMedicamento(id);
        service.update(medicamento);

        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    @ResponseBody  HttpEntity<Object> remove(@PathVariable(name = "id") Long id) {

        service.remove(id);
        return ResponseEntity.noContent().build();
    }
}

