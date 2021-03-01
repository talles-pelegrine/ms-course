package com.mscourse.hrworker.resources;

import com.mscourse.hrworker.entities.Worker;
import com.mscourse.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/worker")
public class WorkerResource {

    @Autowired
    private WorkerRepository repository;

    @GetMapping(value = "/findAll")
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<Worker> find(@PathVariable Long id){
        Worker worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }


}
