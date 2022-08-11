package BFFSpring.BFF.services;

import BFFSpring.BFF.domain.entity.CepEntity;
import BFFSpring.BFF.domain.integrations.ICep;
import BFFSpring.BFF.model.CepDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {
    @Autowired
    ICep _cep;

    public CepDTO cliente(String cep)
    {
        CepEntity cepentity = _cep.getCep(cep);
        CepDTO cepdto = new CepDTO();
        cepdto.setCep(cepentity.getCep());
        cepdto.setBairro(cepentity.getBairro());
        return cepdto;
    }
}
