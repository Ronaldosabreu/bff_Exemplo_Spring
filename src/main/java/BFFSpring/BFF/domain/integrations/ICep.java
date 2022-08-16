package BFFSpring.BFF.domain.integrations;

import BFFSpring.BFF.domain.entity.Cep.CepEntity;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "cep", url="http://viacep.com.br/ws/")
public interface ICep
{
    @GetMapping(value = "/{cep}/json")
    @Headers("Content-Type: application/json")
    CepEntity getCep(@PathVariable("cep") String cep);
}
