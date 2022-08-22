package BFFSpring.BFF.domain.integrations;

import BFFSpring.BFF.domain.entity.Cep.CepEntity;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ICepTest {

    @Autowired
    ICep _cep;

    @Test
    public void testNaoVazio(){
        String cep = "08673-115";
        assertThat(this._cep.getCep(cep)).isNotNull();
    }

    @Test
    public void testBuscaCepIgualdade(){
        String cep = "08673-115";
        CepEntity cepEntity = _cep.getCep(cep);

        Assert.assertNotNull(cepEntity.getCep());
        Assert.assertEquals(cep, cepEntity.getCep());
    }
    @Test
    public void testBuscaCepNull(){
        String cep = "00000-000";
        CepEntity cepEntity = _cep.getCep(cep);

        Assert.assertNull(cepEntity.getCep());

    }


}