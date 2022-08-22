package BFFSpring.BFF.controllers;

import BFFSpring.BFF.model.CepDataResponse;
import BFFSpring.BFF.model.CepDTO;
import BFFSpring.BFF.model.MenuDataResponse;
import BFFSpring.BFF.services.CepService;
import BFFSpring.BFF.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Cep2Controller {

    @Autowired
    CepService cepService;

    @Autowired
    MenuService menuService;

    @GetMapping("/cep")
    public ResponseEntity<CepDataResponse> getCepByCep(@RequestParam String cep)
    {
        if (cep == null || cep =="" || cep.equals(""))
            throw new RuntimeException("Cep não pode ser vazio / está invalido");

            return ResponseEntity.ok(cepService.cliente(cep));

    }

    @PostMapping("/cep")
    @ResponseBody
    public ResponseEntity<CepDTO> getCepByCep(@RequestBody CepDTO cep)
    {
        return ResponseEntity.ok(cep);
    }

    @GetMapping("/menu")
    @ResponseBody
    public ResponseEntity<MenuDataResponse> getMenu()
    {
        return ResponseEntity.ok(menuService.menu());
    }

}
