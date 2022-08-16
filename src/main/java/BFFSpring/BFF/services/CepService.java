package BFFSpring.BFF.services;

import BFFSpring.BFF.domain.entity.Cep.CepEntity;
import BFFSpring.BFF.domain.integrations.ICep;
import BFFSpring.BFF.model.CepDTO;
import BFFSpring.BFF.model.CepDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {
    @Autowired
    ICep _cep;

    public CepDataResponse cliente(String cep)
    {
        CepDataResponse cepDataResponse = new CepDataResponse();

        CepEntity cepentity = _cep.getCep(cep);
        CepDTO cepdto = new CepDTO();
        cepdto.setCep(cepentity.getCep());
        cepdto.setBairro(cepentity.getBairro());

        cepDataResponse.setData(cepdto);

        return cepDataResponse;
    }
}
