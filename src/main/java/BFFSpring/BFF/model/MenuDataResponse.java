package BFFSpring.BFF.model;

import BFFSpring.BFF.domain.entity.Cep.CepEntity;
import BFFSpring.BFF.domain.entity.Menu.ListMenus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class MenuDataResponse {
    private ListMenus data;
}
