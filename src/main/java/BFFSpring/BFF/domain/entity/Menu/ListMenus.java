package BFFSpring.BFF.domain.entity.Menu;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class ListMenus
{
    @JsonProperty("id_cliente")
    public String Id;
    public List<Menu> menus;
}
