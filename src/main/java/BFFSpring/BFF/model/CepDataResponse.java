package BFFSpring.BFF.model;

import BFFSpring.BFF.domain.entity.Cep.CepEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class CepDataResponse {

    private CepDTO data;

 }