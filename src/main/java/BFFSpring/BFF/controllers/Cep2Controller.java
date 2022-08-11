package BFFSpring.BFF.controllers;

import BFFSpring.BFF.domain.entity.CepEntity;
import BFFSpring.BFF.domain.integrations.ICep;
import BFFSpring.BFF.model.CepDTO;
import BFFSpring.BFF.services.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Cep2Controller {

    @Autowired
    CepService cepService;

    @GetMapping("/cep/{cep}")
    @ResponseBody
    public ResponseEntity<CepDTO> getCepByCep(@PathVariable String cep)
    {
        return ResponseEntity.ok(cepService.cliente(cep));
    }

    @PostMapping("/cep")
    @ResponseBody
    public ResponseEntity<CepDTO> getCepByCep(@RequestBody CepDTO cep)
    {
        return ResponseEntity.ok(cep);
    }
}
