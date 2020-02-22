package id.ahn.testing1.controller;

import id.ahn.testing1.domain.Anggota;
import id.ahn.testing1.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/anggota")
public class AnggotaController {
    @Autowired
    private AnggotaRepository anggotaRepository;

    @GetMapping
    public Iterable<Anggota> getAllAnggota(){
        return anggotaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Anggota> getAnggotaById(@PathVariable("id") String id){
        return anggotaRepository.findById(id);
    }

    @PostMapping
    public Anggota addNewAnggota(@RequestBody Anggota anggota){
        return anggotaRepository.save(anggota);
    }

    /*
    @PostMapping
    public ResponseEntity<Car> addNewCar(@RequestBody Car car){
        Car car1 =  carRepository.save(car);

        return new ResponseEntity<>(car1, HttpStatus.OK);
    }

     */

    @DeleteMapping("/{id}")
    public void deleteAnggotaById(@PathVariable("id") String id){
        anggotaRepository.deleteById(id);
    }
}
