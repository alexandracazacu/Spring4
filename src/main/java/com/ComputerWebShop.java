package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerWebShop {

    @Autowired
    ComputerRepository computerRepository;

    @GetMapping("/all")
    public List<Computer> findAll(){
        return computerRepository.findAll();
    }

    @PostMapping("/addcomputer")
    public void save(@RequestBody Computer computer){
        computerRepository.save(computer);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        computerRepository.delete(id);
    }
}