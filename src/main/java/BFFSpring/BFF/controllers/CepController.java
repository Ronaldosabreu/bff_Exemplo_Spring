package BFFSpring.BFF.controllers;

import BFFSpring.BFF.domain.entity.CepEntity;
import BFFSpring.BFF.domain.integrations.ICep;
import BFFSpring.BFF.model.CepDTO;
import BFFSpring.BFF.model.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/cep")
public class CepController {

    @Autowired
    ICep icep;

    @Autowired
    @Qualifier("header")
    private String applicationHeaders;

    @Value("${application.name}")
    private String appName;

    @GetMapping("/{cep}")
    public CepDTO getCep(@PathVariable(value = "cep") String cep)
    {
        CepEntity cepentity = icep.getCep(cep);
        CepDTO cepdto = new CepDTO();
        cepdto.setCep(cepentity.getCep());
        return cepdto;
    }

    @GetMapping("/header")
    @ResponseBody
    public String getHeader()
    {
        /*return applicationHeaders;*/
        return appName;

    }

    @RequestMapping(
            value= {"/header/{nome}"},
            method = RequestMethod.POST,
            consumes = {"applications/json","application/xml"},
            produces = {"applications/json","application/xml"}
    )
    @ResponseBody
    public Cliente helloCliente(@PathVariable("nome") String nomeCliente,
                               @RequestBody Cliente cliente)
    {
        /*return applicationHeaders;*/
        return cliente;

    }

    @PutMapping()
    public CepDTO getCepBody(@RequestBody CepDTO cep)
    {
        CepEntity cepentity = icep.getCep(cep.getCep());
        CepDTO cepdto = new CepDTO();
        cepdto.setCep(cepentity.getCep());
        return cepdto;
    }





}
