package BFFSpring.BFF.domain.entity.Menu;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private String id;
    private String link;
    private String  name;
    private String exact;
    @JsonProperty("class-icon")
    private String class_icon;
    private String admin;
}
